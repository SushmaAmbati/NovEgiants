
public class TestMotherChildrenAssociation {
	public static void main(String args[]) {
		Child1 child1 = new Child1("Sushma", "Devaki");
		Child2 child2 = new Child2("Phani", "Devaki");
		System.out.println("Mother of " + child1.name + " is " + child1.motherName + "");
		System.out.println("Mother of " + child2.name + " is " + child2.motherName + "");
	}
}
