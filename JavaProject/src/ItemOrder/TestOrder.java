package ItemOrder;

import java.util.ArrayList;

public class TestOrder {

	public static void main(String[] args) {

		Customer customer1 = new Customer("Sushma", "Ambati", "sushma.ambati@outlook.com","916-832-1335", 
				new Address("A305", "79 Antioch", "Overland Park", "Kansas", "66204", "USA"));
		Company company = new Company("UnitedShippers", "Lombard", "Fremont","CA", "94538", "USA");
		Item item1 = new Item(1, "XBox", "XC123", 2, 1050.50);
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(item1);
		

		Order order1 = new Order(customer1, items, 700, company);
		order1.printReceipt(order1);
		
		
	}

}