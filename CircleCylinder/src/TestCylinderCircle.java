
public class TestCylinderCircle {
	public static void main(String[] args) {
		
		Cylinder cylinder = new Cylinder(6);
		double circleArea = cylinder.Area(2);
		double circleCircumference = cylinder.CircumferenceOfCircle(2);
		double cylinderArea = (2*circleArea)+(cylinder.height*circleCircumference);
	System.out.println("Area of circle: "+circleArea+" \nCircumference of circle: "+circleCircumference+" \nArea of cylinder: "+cylinderArea+"");
	}
}
