package BinarySearch;


public class BinarySearchApp {

		public static void main(String[] args) 
		{
			int maxSize = 100;		// array size 
			BinarySearch arr;		//reference to array
			
			arr = new BinarySearch(maxSize);
			
			arr.insert(77);
			arr.insert(99);
			arr.insert(44);
			arr.insert(55);
			arr.insert(22);
			arr.insert(88);
			arr.insert(11);
			arr.insert(66);
			arr.insert(53);

			int searchKey = 25;
			
			if(arr.find(searchKey)!=arr.size())
			{
				System.out.println("Found " + searchKey);
			}
			else
			{
				System.out.println("can't find " + searchKey);
			}
	
			arr.display();
			
			// delete 3 items
			arr.delete(00);
			arr.delete(55);
			arr.delete(99);
			
			
			arr.display();
			
		}
}
