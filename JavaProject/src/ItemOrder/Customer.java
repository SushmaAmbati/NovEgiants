package ItemOrder;

public class Customer {
	
	public String firstName;
	public String lastName;
	public String email;
	public String phoneNo;
	public Address address;
	
	public Customer (String fName, String lName, String email, String phoneNo, Address address) {
       
		this.firstName = fName;
		this.lastName = lName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.address = address;
		
	}
	

}
