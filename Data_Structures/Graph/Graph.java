package Graph;

public class Graph {
	private final int MAX_VERTS = 20;
	private Vertex vertexList[]; // list of vertices
	private int adjMat[][]; 	// adjancency matrix
	private int nVerts;
	private Stackx theStack; // object class

	// --------------------------------------------------------------------------------------------------------------------------------------------------

	public Graph() {
		vertexList = new Vertex[MAX_VERTS];
		nVerts = 0;
		for (int j = 0; j < MAX_VERTS; j++) {
			for (int k = 0; k < MAX_VERTS; k++) {
				adjMat[j][k] = 0;
			}
		}
		theStack = new Stackx();
	}

	// --------------------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * add vertex
	 * 
	 * @param lab
	 */
	public void addVertex(char lab) {
		vertexList[nVerts++] = new Vertex(lab);
	}

	// --------------------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * add edge between vertex
	 * 
	 * @param start
	 * @param end
	 */
	public void addEdge(int start, int end) {
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}

	// --------------------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * display vertex
	 * 
	 * @param v
	 */
	public void displayVertex(int v) {
		System.out.print(vertexList[v].label);
	}

	// --------------------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * depth-first search function to search through vertex
	 */
	public void depthFirstSearch() 
	{
		vertexList[0].wasVisited = true;
		displayVertex(0); // display it
		theStack.push(0); // push it

		while (!theStack.isEmpty()) {
			// get an unvisited vertex
			int v = getAdjUnvisitedVertex(theStack.peek());
			if (v == -1) {
				theStack.pop();
			} else {
				vertexList[v].wasVisited = true;
				displayVertex(v);
				theStack.push(v);
			}
		}
		for (int j = 0; j < nVerts; j++) {
			vertexList[j].wasVisited = false;
		}
	}

	// --------------------------------------------------------------------------------------------------------------------------------------------------

	public int getAdjUnvisitedVertex(int v) {
		for (int j = 0; j < nVerts; j++) {
			if (adjMat[v][j] == 1 && vertexList[j].wasVisited == false) {
				return j;
			}
		}
		return -1;
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------
	//end class

}
