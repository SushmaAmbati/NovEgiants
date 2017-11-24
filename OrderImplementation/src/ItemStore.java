
public class ItemStore {
	Item[] itemList;

	public ItemStore() {
		itemList = new Item[5];
		itemList[0] = new Item(100, "IWatch", 30);
		itemList[1] = new Item(200, "XBox", 50);
		itemList[2] = new Item(300, "Chromecast", 70);
		itemList[3] = new Item(400, "Bluetooth Headset", 90);
		itemList[4] = new Item(500, "Videogames", 10);
	}
}
