package Wk1;

public class ZoekenSorteren 
{
	public static void main (String [] args)
	{
		
		char [] rij = {'M', 'H', 'O', 'G', 'P', 'F', 'Z', 'D', 'A', 'K'};
		RijBewerkingen rijbewerking = new RijBewerkingen (rij);
		
		rijbewerking.print(); // ongeordend tabel
		
		
		rijbewerking.bubble(); 		// voordat je binair gaat zoeken		
		rijbewerking.print();	 // moet de tabel gesorteerd zijn.
		
		char target = 'P';
		int index = rijbewerking.binair_zoeken(target);
		System.out.println (index);	
		
		
						
	}
}