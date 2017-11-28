
public class TestMotherChildrenAssociation {
	public static void main(String args[]) {
		Mother mother = new Mother("Devaki");
		Child[] children = new Child[2];

		children[0] = new Child("Sushma", 25);
		children[1] = new Child("Phani", 22);
		mother.setChildren(children);
		for (Child child : children) {
			System.out.println("Mother of " + child.getName() + " is " + mother.getMotherName() + "");
		}
	}
}
