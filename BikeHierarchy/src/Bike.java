
public class Bike {

	float currentSpeed;
	int cadence;
	int currentGear;

	public Bike() {

	}

	public Bike(float currentSpeed, int cadence, int currentGear) {

		this.currentSpeed = currentSpeed;
		this.cadence = cadence;
		this.currentGear = currentGear;
	}

	public void changeCandence(int cadence) {
		this.cadence = cadence;
	}

	public void changeGear(int currentGear) {
		this.currentGear = currentGear;
	}

	public void increaseSpeed(float increasedSpeed) {

		this.currentSpeed = this.currentSpeed + increasedSpeed;
	}

	public void applyBrakes(float decreasedSpeed) {

		this.currentSpeed = this.currentSpeed - decreasedSpeed;
	}

	public void printBikeProperties() {
		System.out.println("Current Speed :" + currentSpeed);
		System.out.println("Current Gear :" + currentGear);
		System.out.println("Current Cadence :" + cadence);
	}

}
