package ItemOrder;

public class Item {
	
		
		public int productId;
		public String productName;
		public String productCode;
		public int quantity;
		public double price;

		public Item(int id, String name, String code, int qty, double price) {
		this.productId = id;
		this.productName = name;
		this.productCode = code;
		this.quantity = qty;
		this.price = price;
		}
		


}
