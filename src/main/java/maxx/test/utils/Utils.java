package maxx.test.utils;

import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.opencv_core;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.FrameGrabber;

import org.bytedeco.javacpp.opencv_objdetect;
import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.OpenCVFrameConverter;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

import static org.bytedeco.javacpp.opencv_imgcodecs.imencode;

public class Utils {

    public static BufferedImage mat2Img(opencv_core.Mat image) {
        ByteBuffer bytemat = ByteBuffer.allocate(image.arraySize());
        imencode(".jpg", image, bytemat);
        byte[] bytes = bytemat.array();
        InputStream in = new ByteArrayInputStream(bytes);
        BufferedImage img = null;
        try {
            img = ImageIO.read(in);
        } catch (IOException e) {

        }
        return img;
    }

    public static FrameGrabber openStream(String stream) {
        // Preload the opencv_objdetect module to work around a known bug.
        Loader.load(opencv_objdetect.class);
        // The available FrameGrabber classes include OpenCVFrameGrabber (opencv_videoio),
        // DC1394FrameGrabber, FlyCaptureFrameGrabber, OpenKinectFrameGrabber, OpenKinect2FrameGrabber,
        // RealSenseFrameGrabber, PS3EyeFrameGrabber, VideoInputFrameGrabber, and FFmpegFrameGrabber.
        return new FFmpegFrameGrabber(stream);


    }

    public static Frame getFrame(FrameGrabber grabber) throws FrameGrabber.Exception {
        Frame frame = grabber.grab();
        while(frame == null) {
            frame = grabber.grab();
        }
        return frame;
    }

    public static opencv_core.Mat convertFrame(OpenCVFrameConverter.ToMat converter, Frame grabbedFrame) {
        opencv_core.Mat image = converter.convert(grabbedFrame);
        while (image == null) {
            image = converter.convert(grabbedFrame);
        }
        return image;
    }

    public static opencv_core.Mat getImage(FrameGrabber grabber, OpenCVFrameConverter.ToMat converter) throws FrameGrabber.Exception {
        opencv_core.Mat image = null;
        while(image == null) {
            Frame frame = grabber.grab();
            image = converter.convert(frame);
        }
        return image;
    }
}
