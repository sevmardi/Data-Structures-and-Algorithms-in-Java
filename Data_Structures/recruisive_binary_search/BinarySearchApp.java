package recruisive_binary_search;

/**
 * 
 * @author sevmardi
 *
 */
public class BinarySearchApp {

	public static void main(String[] args) {
		
		int maxSize = 100;
		
		OrdArray arr;
		
		arr = new OrdArray(maxSize);
		
		arr.insert(72);
		arr.insert(90);
		arr.insert(45);
		arr.insert(126);
		arr.insert(99);
		arr.insert(144);
		arr.insert(135);
		arr.insert(81);
		arr.insert(63);
		arr.insert(36);

		
		arr.display();
		
		int searchKey = 81;
		
		if(arr.find(searchKey) != arr.size())
			System.out.println("Found: " + searchKey);
		else
			System.out.println("Can't find " + searchKey);

	}

}
