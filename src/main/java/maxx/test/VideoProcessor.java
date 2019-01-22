package maxx.test;

import static maxx.test.utils.Utils.mat2Img;
import static org.bytedeco.javacpp.opencv_core.CV_8UC1;
import static org.bytedeco.javacpp.opencv_core.solve;
import static org.bytedeco.javacpp.opencv_imgproc.CV_AA;
import static org.bytedeco.javacpp.opencv_imgproc.fillConvexPoly;
import static org.bytedeco.javacpp.opencv_imgproc.rectangle;
import static org.bytedeco.javacpp.opencv_imgproc.putText;
import static org.bytedeco.javacpp.opencv_imgcodecs.imencode;
import static org.bytedeco.javacpp.opencv_imgproc.resize;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.sql.Date;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.imageio.ImageIO;
import javax.jws.soap.SOAPBinding;

import maxx.test.utils.Utils;
import org.bytedeco.javacpp.opencv_core.Mat;
import org.bytedeco.javacpp.opencv_core.Point;
import org.bytedeco.javacpp.opencv_core.Rect;
import org.bytedeco.javacpp.opencv_core.RectVector;
import org.bytedeco.javacpp.opencv_core.Scalar;
import org.bytedeco.javacpp.opencv_core.Size;

import org.bytedeco.javacpp.opencv_objdetect.HOGDescriptor;
import org.bytedeco.javacv.CanvasFrame;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.FrameGrabber;
import org.bytedeco.javacv.OpenCVFrameConverter;

public class VideoProcessor {

	private final String stream;

	public VideoProcessor(String stream) {
		this.stream = stream;
	}

	public void start() throws org.bytedeco.javacv.FrameGrabber.Exception {

		FrameGrabber grabber = Utils.openStream(stream);
		// FrameGrabber grabber = FrameGrabber.createDefault(0);
		grabber.start();

		OpenCVFrameConverter.ToMat converter = new OpenCVFrameConverter.ToMat();

		Mat grabbedImage = Utils.getImage(grabber, converter);

		int height = grabbedImage.rows();
		int width = grabbedImage.cols();
		System.out.println(String.format("Frame size: %dx%d", height, width));

		// Objects allocated with `new`, clone(), or a create*() factory method are
		// automatically released
		// by the garbage collector, but may still be explicitly released by calling
		// deallocate().
		// You shall NOT call cvReleaseImage(), cvReleaseMemStorage(), etc. on objects
		// allocated this way.
		Mat grayImage = new Mat(height, width, CV_8UC1);

		// The OpenCVFrameRecorder class simply uses the VideoWriter of opencv_videoio,
		// but FFmpegFrameRecorder also exists as a more versatile alternative.
		// FrameRecorder recorder = FrameRecorder.createDefault("output.avi", width,
		// height);
		// recorder.start();

		// CanvasFrame is a JFrame containing a Canvas component, which is hardware
		// accelerated.
		// It can also switch into full-screen mode when called with a screenNumber.
		// We should also specify the relative monitor/camera response for proper gamma
		// correction.
		CanvasFrame frame = new CanvasFrame("Some Title", CanvasFrame.getDefaultGamma() / grabber.getGamma());

		// We can allocate native arrays using constructors taking an integer as
		// argument.
		Point hatPoints = new Point(3);

		HOGDescriptor hog = new HOGDescriptor();
		hog.svmDetector(HOGDescriptor.getDefaultPeopleDetector());

		RectVector peoples = new RectVector();

		ObjectsDetector detector = new ObjectsDetector();

		ExecutorService pool = Executors.newFixedThreadPool(1);

		Future<DetectionResult> future = null;
		Mat processingImage = new Mat(height, width, CV_8UC1);
		;

		while (frame.isVisible()) {

			if (future == null) {
				grabbedImage = Utils.getImage(grabber, converter);
				processingImage = grabbedImage;
				future = pool.submit(new CalableDetector(detector, mat2Img(processingImage)));
			}

			if (future != null && future.isDone()) {
				try {
					DetectionResult result = future.get();

					for (int i = 0; i < result.scores.length; ++i) {
						if (result.scores[i] < 0.1) {
							continue;
						}
						float[] rect = result.boxes[i];

						int rows = processingImage.rows();
						int cols = processingImage.cols();

						float x = rect[1] * cols;
						float y = rect[0] * rows;
						float right = rect[3] * cols;
						float bottom = rect[2] * rows;

						rectangle(processingImage, new Point((int) x, (int) y), new Point((int) right, (int) bottom),
								Scalar.RED, 1, CV_AA, 0);
						// cv.rectangle(img, (int(x), int(y)), (int(right), int(bottom)), (125, 255,
						// 51), thickness=2)
						String text = String.format("%s (score: %.4f)\n", detector.labels[(int) result.classes[i]],
								result.scores[i]);
						putText(processingImage, text, new Point((int) x, (int) y), 1, 1.0, new Scalar(0, 255, 255, 0));

					}
					putText(processingImage, String.valueOf(result.processingTime), new Point(10, 15), 1, 1.0,
							new Scalar(255, 255, 0, 0));
					Frame rotatedFrame = converter.convert(processingImage);

					frame.showImage(rotatedFrame);
				} catch (Exception e) {
					e.printStackTrace();
					// TODO: handle exception
				}
				grabbedImage = Utils.getImage(grabber, converter);
				processingImage = grabbedImage;
				//resize(grabbedImage, processingImage, new Size(400, 400));
				future = pool.submit(new CalableDetector(detector, mat2Img(processingImage)));
			} else {
				grabber.grab();
			}

			// resize(grabbedImage, croppedimage, new Size(400, 400));

			// cvtColor(grabbedImage, grayImage, CV_BGR2GRAY);

			/*
			 * hog.detectMultiScale(grabbedImage, peoples, 0, new Size(4, 4), new Size(8,
			 * 8), 1.05, 2.0, false); long total = peoples.size(); for (long i = 0; i <
			 * total; i++) { Rect r = peoples.get(i); int x = r.x(), y = r.y(), w =
			 * r.width(), h = r.height(); rectangle(grabbedImage, new Point(x, y), new
			 * Point(x + w, y + h), Scalar.RED, 1, CV_AA, 0);
			 * 
			 * // To access or pass as argument the elements of a native array, call
			 * position() // before. hatPoints.position(0).x(x - w / 10).y(y - h / 10);
			 * hatPoints.position(1).x(x + w * 11 / 10).y(y - h / 10);
			 * hatPoints.position(2).x(x + w / 2).y(y - h / 2); fillConvexPoly(grabbedImage,
			 * hatPoints.position(0), 3, Scalar.GREEN, CV_AA, 0); Frame rotatedFrame =
			 * converter.convert(grabbedImage); frame.showImage(rotatedFrame); }
			 */

		}
		pool.shutdown();
		frame.dispose();
		// recorder.stop();
		grabber.stop();
		System.out.println("Finish");

	}

}
