
public class RoadBike extends Bike {
	int HandleDropdownAngle;

	public RoadBike(float currentSpeed, int cadence, int currentGear, int handleDropdownAngle) {
		super(currentSpeed, cadence, currentGear);
		HandleDropdownAngle = handleDropdownAngle;
	}

	public void changeHandleDropdownAnge(int HandleDropdownAngle) {

		this.HandleDropdownAngle = HandleDropdownAngle;
	}

	public void printRoadBikeProperties() {
		System.out.println("Road Bike Properties:");
		printBikeProperties();
		System.out.println("Handle Dropdown Angle:" + HandleDropdownAngle);
	}

	public static void main(String[] args) {

		RoadBike roadBike = new RoadBike(40, 5, 1, 45);
		roadBike.changeCandence(6);
		roadBike.increaseSpeed(30);
		roadBike.applyBrakes(15);
		roadBike.printRoadBikeProperties();
	}
}
