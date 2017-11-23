
public class Owner extends Car {
	String ownerName;
	   Owner(String name, String carName, int year){
		super(carName, year);
		this.ownerName=name;
}
}