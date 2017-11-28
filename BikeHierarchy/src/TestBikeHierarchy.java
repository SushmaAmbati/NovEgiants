
public class TestBikeHierarchy {
	public static void main(String[] args) {

		Bike bike = new Bike(45, 5, 2);
		bike.increaseSpeed(2);
		bike.changeGear(4);
		bike.printBikeProperties();
	}
}
