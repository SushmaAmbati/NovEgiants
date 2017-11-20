
public class Circle {
	double radius;
	double area;
	double diameter;
	
	void calculateArea(double r) {
		area = Math.PI*r*r;
		System.out.println("Area of Circle for radius "+r+" is "+area+"");
		
	}
}
