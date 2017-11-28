
public class Heart {
	private int noOfArteries;
	private int noOfVentricles;
	private String shape;
	private Body body;

	public Heart() {

	}

	public Heart(int noOfArteries, int noOfVentricles, String shape) {
		super();
		this.noOfArteries = noOfArteries;
		this.noOfVentricles = noOfVentricles;
		this.shape = shape;
	}

	public int getNoOfArteries() {
		return noOfArteries;
	}

	public void setNoOfArteries(int noOfArteries) {
		this.noOfArteries = noOfArteries;
	}

	public int getNoOfVentricles() {
		return noOfVentricles;
	}

	public void setNoOfVentricles(int noOfVentricles) {
		this.noOfVentricles = noOfVentricles;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

}
