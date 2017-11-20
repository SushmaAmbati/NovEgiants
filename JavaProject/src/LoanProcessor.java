
public class LoanProcessor {
	 void processLoan(SavingsAccount account) {
		 System.out.println("AccountNo: "+account.accountNo+"");
		 System.out.println("LoanProcessed");
		 account.withdraw(2000);
		 System.out.println("Processing fee deducted");
	 }

}
