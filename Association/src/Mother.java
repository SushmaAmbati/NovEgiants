
public class Mother {
	String motherName;
	Child[] children = new Child[2];

	public Mother(String name) {
		this.motherName = name;

		children[0] = new Child("Sushma", 25);
		children[1] = new Child("Phani", 22);
	}

	public void checkOnetoManyAssociation() {
		printDetails(children, motherName);
	}

	public void printDetails(Child[] children, String mName) {
		if (children.length > 0) {

			for (int i = 0; i < children.length; i++) {
				System.out.println("Mother of " + children[i].name + " is " + mName + "");
			}
		} else {
			System.err.println("Enter Children Details");

		}
	}
}
