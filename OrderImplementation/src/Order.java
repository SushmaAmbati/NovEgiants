
public class Order {
	int id;
	int quantity;
	int itemId;

	public Item processOrder(Item[] itemStock, int itemId, int requiredQty) {
		boolean itemFound = false;
		if (itemStock.length > 0) {
			for (int i = 0; i < itemStock.length; i++) {
				if (itemStock[i].id == itemId && itemStock[i].stock >= requiredQty) {
					System.out.println("Item is in the stock");
					itemStock[i].stock -= requiredQty;
					itemFound = true;
					id = 1;
					quantity = requiredQty;
					this.itemId = itemId;
					return itemStock[i];
				}
			}
			if (itemFound == false) {
				System.err.println("Item not in stock");
			}

		} else {
			System.err.println("There are no items in Stock. Please fill the stock.");
		}
		return null;
	}

	public void printOrder(Item itemOrdered) {
		System.out.println("Order placed Successfully! \nOrderDetails:");

		System.out.println("Order ID: " + id + " \nItem Id: " + itemOrdered.id + " \nItem Name: " + itemOrdered.name
				+ " \nQuantity: " + quantity + "");
	}
}
