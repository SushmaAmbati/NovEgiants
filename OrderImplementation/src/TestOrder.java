
public class TestOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemStore itemStore = new ItemStore();
		Order order = new Order();
		Item itemOrdered = order.processOrder(itemStore.itemList, 100, 5);
		if (itemOrdered != null && itemOrdered.id != 0) {
			order.printOrder(itemOrdered);
		}
	}
}
