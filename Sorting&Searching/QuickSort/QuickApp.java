package QuickSort;

public class QuickApp {

	public static void main(String[] args) {
		int maxSize = 17;
		QuickSort1 quicky; 
		
		quicky = new QuickSort1(maxSize);
		
		for(int j=0; j<maxSize;j++)
		{
			long n = (int)(java.lang.Math.random()*99);
			quicky.insert(n);
		}
		
		quicky.display();
		quicky.quickSort();
		quicky.display();
	}	
}
