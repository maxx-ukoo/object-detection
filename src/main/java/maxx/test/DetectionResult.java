package maxx.test;

public class DetectionResult {
	public float[] scores;
	public float[] classes;
	public float[][] boxes;
	public long processingTime;
	
	public DetectionResult(float[] scores, float[] classes, float[][] boxes, long processingTime) {
		this.scores = scores;
		this.classes = classes;
		this.boxes = boxes;
		this.processingTime = processingTime;
	}

}
