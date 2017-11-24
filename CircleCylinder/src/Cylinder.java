
public class Cylinder extends Circle {
	int height;
	double cylinderArea, rectangleArea;
	Rectangle rectangle;

	public Cylinder(int height) {
		this.height = height;
	};

	public double area(double circleArea, double circleCircumference) {
		cylinderArea = (2 * circleArea) + rectangleArea;
		return cylinderArea;
	}

	public double CircumferenceOfCircle(int rad) {
		return 2 * Math.PI * rad;
	}

	public void calculateProperties() {
		rectangle = new Rectangle(height);
		circleArea = area(2);
		circleCircumference = CircumferenceOfCircle(2);
		rectangleArea = rectangle.area(circleCircumference);
		cylinderArea = area(circleArea, rectangleArea);
	}

	public void printProperties() {
		System.out.println("Area of circle: " + circleArea + " \nCircumference of circle: " + circleCircumference
				+ " \nArea of cylinder: " + cylinderArea + "");
	}
}
