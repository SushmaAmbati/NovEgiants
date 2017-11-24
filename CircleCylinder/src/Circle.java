
public abstract class Circle {
	double radius;
	double circleArea, circleCircumference;

	public double area(int rad) {

		return Math.PI * rad * rad;

	}

	public abstract double CircumferenceOfCircle(int rad);

}
