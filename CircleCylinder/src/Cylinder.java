
public class Cylinder {
	int height;
	double cylinderArea;
	Rectangle rectangle;
	Circle circle;

	public Cylinder(int height) {
		this.height = height;
	};

	public double area() {
		rectangle = new Rectangle(height);
		circle = new Circle(2);
		cylinderArea = (2 * circle.area()) + rectangle.area();
		return cylinderArea;
	}

	public void printProperties() {
		circle.printProperties();
		rectangle.printProperties();
		System.out.println("Area of Cylinder is " + cylinderArea);
	}

}
