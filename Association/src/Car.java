
public class Car {
	private String carName;
	private int year;
private Owner owner;
	public Car() {

	}

	public Car(String name, int year) {
		this.carName = name;
		this.year = year;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	
}
