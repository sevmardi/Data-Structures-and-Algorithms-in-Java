package LinearSearch;

public class LinearSearchApp
{
	public static void main(String[] args) {
		int maxSize = 100;		// array size 
		LinearSearch arr;		// reference to array
		arr = new LinearSearch(maxSize);
		
		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(66);
		arr.insert(53);
		
		arr.display();// display item 
		
		int searchKey = 25;
		if(arr.find(searchKey))
		{
			System.out.println("Found " + searchKey);
		}
		else
		{
			System.out.println("Can't find " + searchKey);
		}
		// delete 3 items
		arr.delete(00);
		arr.delete(55);
		arr.delete(99);
		
		arr.display();// disply the final result
	}	// end main()
	
}// end class
