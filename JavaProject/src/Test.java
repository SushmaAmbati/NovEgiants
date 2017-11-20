
public class Test {

	public static void main(String args[])

{
	Bicycle bicycle = new Bicycle();
	
	bicycle.changeGear(2);
	bicycle.changeCadence(10);
	bicycle.name = "hero";
	bicycle.printDetails();
	
Bicycle bicycle2 = new Bicycle();
	
	bicycle2.changeGear(1);
	bicycle2.changeCadence(20);
	bicycle2.name = "avon";
	bicycle2.printDetails();
	
}
}