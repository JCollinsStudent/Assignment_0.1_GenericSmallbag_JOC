
public class Application {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Item<String> stringItem = new Item<String>();
		stringItem.setE("Josh Collins");
		Item<Integer> intItem = new Item<Integer>();
		intItem.setE(22);
		
		SmallBag<Item> stringSB = new SmallBag<Item>();
		stringSB.setItem(stringItem);
		Item<String> returnedStringItem = stringSB.getItem();
		System.out.println(returnedStringItem.getE());
		
		SmallBag<Item> intSB = new SmallBag<Item>();
		intSB.setItem(intItem);
		Item<Integer> returnedIntItem = intSB.getItem();
		System.out.println(returnedIntItem.getE());
		
	}

}
