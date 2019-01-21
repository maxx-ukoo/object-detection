package maxx.test;

import java.awt.image.BufferedImage;
import java.util.concurrent.Callable;

public class CalableDetector implements Callable<DetectionResult> {

	private final ObjectsDetector detector;
	private final BufferedImage img;
	
	public CalableDetector(ObjectsDetector detector, BufferedImage img) {
		this.detector = detector;
		this.img = img;
	}
	
	@Override
	public DetectionResult call() throws Exception {
		long start = System.currentTimeMillis();
		DetectionResult result = detector.detectObjects(img);
		result.processingTime = (System.currentTimeMillis() - start);
		return result;
	}

}
