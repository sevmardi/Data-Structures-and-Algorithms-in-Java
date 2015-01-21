package BinarySearchTree;

public class Tree 
{	
	private Node root;             // first node of tree
	
// -------------------------------------------------------------
   public Tree()                  // constructor
      { root = null; }            // no nodes in tree yet
// -------------------------------------------------------------
   
   public Node find(int key)      	// find node with given key
      {                           	// (assumes non-empty tree)
      Node current = root;               // start at root
      while(current.iData != key)        // while no match,
         {
         if(key < current.iData)         // go left?
            current = current.leftChild;
         else                            // or go right?
            current = current.rightChild;
         if(current == null)             // if no child,
            return null;                 // didn't find it
         }
      return current;                    // found it
      }  // end find()   
   
// -------------------------------------------------------------	   
   public void insert(int id, double dd)
   {
   Node newNode = new Node();    // make new node
   newNode.iData = id;           // insert data
   newNode.dData = dd;
   if(root==null)                // no node in root
      root = newNode;
   else                          // root occupied
      {
      Node current = root;       // start at root
      Node parent;
      while(true)                // (exits internally)
         {
         parent = current;
         if(id < current.iData)  // go left?
            {
            current = current.leftChild;
            if(current == null)  // if end of the line,
               {                 // insert on left
               parent.leftChild = newNode;
               return;
               }
            }  // end if go left
         else                    // or go right?
            {
            current = current.rightChild;
            if(current == null)  // if end of the line
               {                 // insert on right
               parent.rightChild = newNode;
               return;
               }
            }  // end else go right
         }  // end while
      }  // end else not root
   }  // end insert() 
// -------------------------------------------------------------	   
	   public boolean delete(int key)
	   {
		   Node current = root;
		   Node parent = root;
		   boolean isLeftChild = true;
		   
		   while(current.iData != key)	// search for node
		   {
			   parent = current;		
			   if(key < current.iData)		// go left?
			   {
				   isLeftChild = true;
				   current = current.leftChild;
			   }
			   else								// or go right?
			   {
				   isLeftChild = false;
				   current = current.rightChild;
			   }
			   if(current == null)			 // end of the line,
			   {
				   return false;			 // didn't find it
			   }
			   // end while
			   // found node to delete
		   }
		   // if no children, simply delete it
		   if(current.leftChild == null && current.rightChild==null)
		   {
			   if(current == root)			 // if root,
			   {	
				   root = null;				// tree is empty
			   }
			   else if (isLeftChild)
			   {
				   parent.leftChild = null;		// disconnect from parent
			   }
			   else
			   {
				   parent.rightChild = null;
			   }
		   }   
		   // not finished yet
		 
		   return true;
		
	   }
// -------------------------------------------------------------		   
	   public void display()             // displays array contents
	      {
	
	    
	      System.out.println("");
	      }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
