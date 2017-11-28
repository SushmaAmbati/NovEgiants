
public class TestCarDriverAssociation {
	public static void main(String args[]) {
		Owner owner = new Owner("Sushma");
		Car car = new Car("Dodge", 2010);
		car.setOwner(owner);
		System.out.println("The owner of car "+car.getCarName()+" "+car.getYear()+" is "+car.getOwner().getOwnerName());
	}
}
