package SearchLinair_binary;

public class RijBewerkingen
{
	private char[] rij;
	int foundIndex = -1;

	// constructor
	public RijBewerkingen(char[] rij) 
	{
		this.rij = rij;
	}

	// als target voor komt in de tabel dan wordt de index van target teruggegeven
	// als target niet voor komt dan wordt -1 teruggegeven.

	public int lineair_zoeken(char target) 
	{

		for (int i = 0; i < rij.length; i++) {
			if (rij[i] == target) {
				foundIndex = i;

			}
		}
		return foundIndex;
	}

	// als target voor komt in de gesorteerde tabel dan wordt de index van/ target
	// teruggegeven; als target niet voor komt dan -1.

	public int binair_zoeken(char target) {

		int startindex = 0;
		int endIndex = rij.length - 1;
		int midindex = (startindex + endIndex) / 2;
		int midElement = rij[midindex];

		while (startindex <= endIndex) 
		{

			if (midElement < target) 
			{
				startindex = midindex + 1;
				midindex = (startindex + endIndex) / 2;
				midElement = rij[midindex];
			} 
			else if (midElement > target)
			{
				endIndex = midindex - 1;
				midindex = (startindex + endIndex) / 2;
				midElement = rij[midindex];
			} 
			else
			{
				foundIndex = midindex;
				break;

			}

		}

		return foundIndex;

	}

	// de tabel wordt in oplopende volgorde gesorteerd
	// mbv de 'bubble-sort'-methode

	public void bubble() 
	{
		
		for(int i = 0; i<rij.length; i++)
		{
			for(int x =1; x<rij.length-i; i++)
			{				
				if(rij[x -1] > rij[x])
				{					
					int temp = rij[x - 1];
					rij[x -1] =  rij[x];
					rij[x] = (char)temp;
					
				}
				
			}
			
			
		}
		
	}

	public void print()
	{
		for (int te = 0; te < rij.length; te++)
			System.out.print(rij[te] + "  ");
		System.out.println("\n\n\n");
	}

}