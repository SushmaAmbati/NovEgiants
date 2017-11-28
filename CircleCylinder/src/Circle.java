
public class Circle extends Shapes {
	double radius;
	double circleArea, circleCircumference;

	public Circle(int rad) {
		this.radius = rad;
	}

	@Override
	public double area() {

		circleArea = Math.PI * radius * radius;
		return circleArea;

	}

	public double circumferenceOfCircle() {
		circleCircumference = 2 * Math.PI * radius;
		return circleCircumference;
	}

	public void printProperties() {
		System.out.println("Area of Circle is " + circleArea);
		System.out.println("Circumference of Circle is " + circumferenceOfCircle());
	}

}
