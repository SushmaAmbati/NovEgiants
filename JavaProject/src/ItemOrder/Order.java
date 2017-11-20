package ItemOrder;
import java.util.ArrayList;

public class Order {
	public int orderNo;
	public Customer customer;
	public ArrayList<Item> itemsBought;
	public Company company;
	
	public Order(Customer customer, ArrayList<Item> itemsBought, int orderNo, Company company) {
		this.orderNo = orderNo;
		this.customer = customer;
		this.itemsBought = itemsBought;
		this.company = company;
	}
	
	public void calculateTotal() {
		
	}
	
	public void printReceipt(Order order) {
		System.out.println("Order No: "+order.orderNo+"\n, Items Bought:\n Item No: "+order.itemsBought+", Customer Information:\n "+order.customer.firstName+"");
		
			
	}
	 public void sendEmail() {
		 
	 }
	
	
}
