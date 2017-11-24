
public class Car {
	String carName;
	int year;

	public Car(String name, int year) {
		this.carName = name;
		this.year = year;
	}

	public void printDetails(String ownerName) {
		System.out.println("The owner of car " + carName + " " + year + " is " + ownerName + "");
	}
}
