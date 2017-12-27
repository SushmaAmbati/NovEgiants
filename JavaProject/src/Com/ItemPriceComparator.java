package Com;

import java.util.Comparator;

public class ItemPriceComparator implements Comparator<Item>{
public static void main(String[] args) {
	
}

@Override
public int compare(Item o1, Item o2) {
	if(o1.getPrice() > o2.getPrice()) {
	return 1;
	
	}else if(o1.getPrice() < o2.getPrice()){
		return -1;
		
	}
	return 0;
}
}
