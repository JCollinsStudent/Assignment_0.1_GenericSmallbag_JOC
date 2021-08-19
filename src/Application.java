
public class Application {

	public static void main(String[] args) {
		Item<String> stringItem = new Item<String>();
		stringItem.setE("Josh Collins");
		Item<Integer> intItem = new Item<Integer>();
		intItem.setE(22);
		
		SmallBag<Item> sb = new SmallBag<Item>();
		sb.setItem(intItem);
		Item<Integer> returnedItem = sb.getItem();
		System.out.println(returnedItem.getE());
		
	}

}
