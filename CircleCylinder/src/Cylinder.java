
public class Cylinder extends Circle {
	double height, cylinderArea;

	public Cylinder() {
	};

	public Cylinder(double height) {
		this.height = height;
	}

	public double Area(double circleArea, double circleCircumference) {
		cylinderArea = (2 * circleArea) + (height * circleCircumference);

		return cylinderArea;

	}

	public double CircumferenceOfCircle(int rad) {

		Cylinder cylinder = new Cylinder();
		cylinder.circleCircumference = 2 * Math.PI * rad;
		return cylinder.circleCircumference;

	}

}
