
public abstract class Circle {
	double radius;
	double areaOfCircle, circleCircumference;

	public double Area(int rad) {

		areaOfCircle = Math.PI * rad * rad;

		return areaOfCircle;

	}

	public abstract double CircumferenceOfCircle(int rad);

}
