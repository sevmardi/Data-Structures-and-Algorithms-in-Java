package Graph;

public class App {
	
	public static void main(String[] args) {
		Graph  graph = new Graph();
		
		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		
		
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(0, 3);
		graph.addEdge(3, 4);
		
		System.out.print("visits: ");
		graph.depthFirstSearch();
		System.out.println();
		
//---------------------------------------------------------------------------------------------------------------------------------------------------------
		
	}
}
