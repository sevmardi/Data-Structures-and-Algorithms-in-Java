package BST;

public class BinarySearchTree
{
	private BSTNode root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	// insert into tree 
	public boolean add(int value)
	{
		if(root == null)
		{
			root = new BSTNode(value);
			return true;
		}
		else
		{
			return root.add(value);
		}
	
	}
}
