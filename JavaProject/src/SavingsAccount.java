
public class SavingsAccount {
	
	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}
	
	
	public SavingsAccount(int accNo, float balance, String status, int pin) {
		super();
		this.accountNo = accNo;
		this.balance = balance;
		this.status = status;
		this.pin = pin;
	}


	int accountNo;
	float balance;
	String status;
	int pin;
	static float interestRate = 2.25f;
	
	void printDetails() {
		System.out.println("Accountno: "+accountNo+"\nBalance: "+balance+"\nStatus: "+status+"\n");
	}
	void withdraw(int withdrawalAmount) {
        if(status == "active") {
        	
        	if(withdrawalAmount <= balance) {
        		balance = balance - withdrawalAmount;
        	}
        
        else {
        	System.out.println("You have insufficient funds");
        }
        	
        }
        else {
        	System.err.println("Account is inactive");
        }
}
}