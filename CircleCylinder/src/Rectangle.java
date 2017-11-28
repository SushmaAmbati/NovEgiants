
public class Rectangle extends Shapes {
	double height;
	double area;

	public Rectangle(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		Circle circle = new Circle(2);
		area = height * circle.circumferenceOfCircle();
		return area;
	}

	public void printProperties() {
		System.out.println("Area of Rectangle is " + area);
	}

}
