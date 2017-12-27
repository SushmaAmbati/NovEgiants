package Com;

import java.util.Comparator;

public class ItemNameComparator implements Comparator<Item> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public int compare(Item o1, Item o2) {
		if(o1.getName().equals(o2.getName())) {
		return 1;
		
		}else if(o1.getPrice() < o2.getPrice()){
			return 0;
			
		}
		return 0;
	}
}
