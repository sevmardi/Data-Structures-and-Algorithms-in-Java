package Wk3_versie4;

public class LItr {

	
	private Entry pos = header;

    public boolean hasNext() 
    {
      return pos.next != header;
    }

    public Object next() 
    {
      pos = pos.next;
      return pos.element;
    }

    public boolean hasPrevious() 
    {
      return pos.previous != header;
    }

    public Object previous() 
    {
      pos = pos.previous;
      return pos.element;
    }
  } // Einde inwendige klasse LItr

