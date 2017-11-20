
public class Bicycle {
	
	int gear;
	int speed;
	int cadence;
	String name;
	
	void changeCadence(int newValue) {
	cadence = newValue;	
	}
	void changeGear(int newValue) {
	gear = newValue;	
	}
	void applyBrakes(int decrement) {
	speed = speed - decrement;	
	}
	void printDetails() {
		System.out.println("Name: "+name+"\nSpeed: "+speed+"\nGear: "+gear+"\nCadence: "+cadence+"");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
