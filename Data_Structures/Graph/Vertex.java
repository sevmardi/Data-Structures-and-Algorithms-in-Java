package Graph;

public class Vertex
{
	public char label;			 // label for e.g. 'A'
	public boolean wasVisited; 
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	public Vertex(char lab)
	{
		label = lab;
		wasVisited = false;
	}
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	//end class Vertex
}
