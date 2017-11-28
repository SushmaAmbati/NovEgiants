
public class Money {
	private int noOfBills;
	private String currencyType;

	public Money() {

	}

	public Money(int noOfBills, String currencyType) {
		super();
		this.noOfBills = noOfBills;
		this.currencyType = currencyType;
	}

	public int getNoOfBills() {
		return noOfBills;
	}

	public void setNoOfBills(int noOfBills) {
		this.noOfBills = noOfBills;
	}

	public String getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

}
