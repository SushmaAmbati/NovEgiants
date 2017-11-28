
public class Mother {
	private String motherName;
	private Child[] children;

	public Mother(String name) {
		this.motherName = name;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public Child[] getChildren() {
		return children;
	}

	public void setChildren(Child[] children) {
		this.children = children;
	}

}
