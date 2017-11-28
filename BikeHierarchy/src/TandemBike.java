
public class TandemBike extends Bike {
	String frontSeatShape;
	String backSeatShape;

	public TandemBike(float currentSpeed, int cadence, int currentGear, String frontSeatColor, String backSeatColor) {
		super(currentSpeed, cadence, currentGear);
		this.frontSeatShape = frontSeatColor;
		this.backSeatShape = backSeatColor;
	}

	public void changeFrontSeat(String shape) {

		this.frontSeatShape = shape;
	}

	public void changeBackSeat(String shape) {
		this.backSeatShape = shape;
	}

	public void printTandemBikeProperties(TandemBike tandemBike) {
		System.out.println("Tandem Bike Properties:");
		printBikeProperties();
		System.out.println("Front Seat Shape :" + frontSeatShape);
		System.out.println("Back Seat Shape :" + backSeatShape);
	}

	public static void main(String[] args) {

		TandemBike tandemBike = new TandemBike(65, 4, 4, "Oval", "Circle");
		tandemBike.increaseSpeed(20);
		tandemBike.applyBrakes(5);
		tandemBike.printTandemBikeProperties(tandemBike);
		tandemBike.changeBackSeat("Oval");
		tandemBike.printTandemBikeProperties(tandemBike);

	}
}
