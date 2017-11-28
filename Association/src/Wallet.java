
public class Wallet {
	private String shape;
	private String color;
	private Money money;

	public Wallet() {

	}

	public Wallet(String shape, String color) {
		super();
		this.shape = shape;
		this.color = color;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Money getMoney() {
		return money;
	}

	public void setMoney(Money money) {
		this.money = money;
	}

}
