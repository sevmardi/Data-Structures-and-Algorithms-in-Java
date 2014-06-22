package Wk4_versie5;

public class LItr {

	
	private Entry pos;

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

