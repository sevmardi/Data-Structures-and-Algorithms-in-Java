package Wk3_versie4;

public class Lijst 
{
  private Entry header;
  private int size;
 

  // Constructor voor een lege lijst
  public Lijst() 
  {
  /*  header = new Entry( null, null, null );
    header.next = header;
    header.previous = header;*/
	  
	  header = null;
  }

  // Object vooraan toevoegen
  public void addFirst(String element, String next, String previous ) 
  {
    
	Entry entry = new Entry( element,  next,  previous);
	entry.next = header;
	header = entry;
	
	}

  // Object vooraan opvragen
  public Entry getFirst() 
  {
    
	  if(header ==null);
	  return header;
  }

  // Object vooraan verwijderen
  
  public Entry removeFirst() 
  
  {
	// Removes the Link from the List
	   Entry temp = header;
	  header=header.next;
	  return temp;
  }
 
  public void addlast(Entry header)
  {

	  
  }
  
  public Entry getLast()
  {
  	
  	return null; // nog ff niet
  }
  
  public Entry removelast()
  {
  	
	  Entry currentlink = header;
	  Entry previouslink = header;
	  
  		while(currentlink.element !=header)
  		{
  			
  			
  			// check
  			if(currentlink.next==null)
  			{
  				
  			return null;
  			}
  			else
  			{
  				
  				previouslink=currentlink;
  				currentlink=currentlink.next;
  				
  			}
  		}
  		if(currentlink == header)
  		{
  			header=header.next;
  			
  		}
  		else
  		{
  			
  			System.out.println("aha, iets gevonden! ");
  			
  			previouslink.next = currentlink.next;
  		}
  		return currentlink;
  }

  // Aantal objecten in de lijst afleveren
  public int size() 
  {
    return size;
    
  }

  // De lijst leegmaken
  public void clear() 
  {
    
  }
  

  public boolean isEmpty()
	{
		
		
		return header == null;
		
	}

  // Lever een iterator voor de lijst
  // wtf is dit?
  public Iterator iterator() 
  {
    return new LItr();
  }

  // private methoden

  private void addBefore( Object o, Entry e ) 
  {
    Entry newEntry = new Entry(o, e, e.previous);
    newEntry.previous.next = newEntry;
    newEntry.next.previous = newEntry;
    size++;
  }

  @SuppressWarnings("unused")
private void remove( Entry e ) 
  {
    if( e == header )
      
    e.previous.next = e.next;
    e.next.previous = e.previous;
    size--;
  }
  



  
  
  


 
}
  

  
  

