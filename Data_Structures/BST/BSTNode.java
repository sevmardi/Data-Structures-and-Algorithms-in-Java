package BST;

public class BSTNode {
	
	private int value;
	private BSTNode left;
	private BSTNode right;
	
	public BSTNode(int value)
	{
		this.value = value;
		left = null;
		right = null;	
	}
	// add value into tree
	public boolean add(int value)
	{
		if(value == this.value)
		{
			return false;
		}
		else if(value <this.value)
		{
			left = new BSTNode(value);
			return true;
		}
		else if(value > this.value)
		{
			if(right == null)
			{
				right = new BSTNode(value);
				return true;
			}
			else
				return right.add(value);
		}
		return false;
	}
}
