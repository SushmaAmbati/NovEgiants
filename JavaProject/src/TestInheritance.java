
public class TestInheritance {

	public static void main(String[] args) {
		JuniorSavingsAccount account = new JuniorSavingsAccount(1234, 5000f, "Active", 123, "Dad");
		System.out.println("AccountNo: "+account.accountNo+"");
		System.out.println("Balance: "+account.balance+"");
		System.out.println("Status: "+account.status+"");
		System.out.println("Pin: "+account.pin+"");
		System.out.println("Guardian: "+account.guardian+"");

	}

}
