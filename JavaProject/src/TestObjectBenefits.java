
public class TestObjectBenefits {

	public static void main(String[] args) {
		LoanProcessor loanProcessor  = new LoanProcessor();
		SavingsAccount account = new SavingsAccount(101,5000,"active",123);
		loanProcessor.processLoan(account);

	}

}
