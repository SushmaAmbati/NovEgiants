
public class MountainBike extends Bike {

	int currentChainring;

	public MountainBike(float currentSpeed, int cadence, int currentGear, int currentChainring) {
		super(currentSpeed, cadence, currentGear);
		this.currentChainring = currentChainring;
	}

	public void changeChainring(int currentChainring) {

		this.currentChainring = currentChainring;
	}

	public void printMountainBikeProperties() {
		System.out.println("Mountain Bike Properties:");
	    printBikeProperties();
		System.out.println("Current ChainRing :" + currentChainring);
	}

	public static void main(String[] args) {

		MountainBike bike = new MountainBike(50, 2, 3, 3);
		bike.increaseSpeed(30);
		bike.applyBrakes(20);
		bike.printMountainBikeProperties();

	}

}
