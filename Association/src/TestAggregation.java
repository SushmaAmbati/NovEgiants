
public class TestAggregation {

	public static void main(String[] args) {
		Wallet wallet = new Wallet("Rectangle", "Black");
		Money money = new Money(12,"USA");
		wallet.setMoney(money); 
		System.out.println("Wallet has "+wallet.getMoney().getNoOfBills()+" bills of "+wallet.getMoney().getCurrencyType()+" currnecy ");
		wallet.getMoney().setCurrencyType("India");
		wallet.getMoney().setNoOfBills(10);
		System.out.println("Wallet has "+wallet.getMoney().getNoOfBills()+" bills of "+wallet.getMoney().getCurrencyType()+" currnecy ");
	}

}
