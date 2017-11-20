
public class TestSavingsAccount {

	public static void main(String[] args) {
		
		SavingsAccount account = new SavingsAccount(101,5000,"active",123);
//		account.accountNo = 101;
//		account.balance = 5000;
//		account.status="active";
//		account.pin=123;
		account.printDetails();
		
		SavingsAccount account2 = new SavingsAccount(102,6000,"active",456);
//		account2.accountNo = 102;
//		account2.balance = 6000;
//		account2.status="active";
//		account2.pin=456;
		account2.printDetails();
		System.out.println("Interest rate: "+SavingsAccount.interestRate+"");
		

	}

}
