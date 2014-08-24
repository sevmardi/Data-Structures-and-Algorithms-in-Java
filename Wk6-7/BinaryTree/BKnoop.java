package BinaryTree;
public class BKnoop<E> 
{
	//https://github.com/MrHus/TuttiFruti/blob/master/src/ida1/trees/BKnoop.java
  private BKnoop<E> parent, leftChild, rightChild;
  private E userObject;
  
  public static final int LEFT = 0;
  public static final int RIGHT = 1;
  
  // Constructors
  public BKnoop() 
  {
    this( null );
  }
//************************************************************************************************ 
  public BKnoop( E userObject )
  {
    parent = null;
    leftChild = null;
    rightChild = null;
    this.userObject = userObject;
  }
//************************************************************************************************ 
  // Methoden
  public void add( BKnoop<E> newChild )
  {
    if( leftChild == null ) 
      insert( newChild, LEFT );
    else
      if( rightChild == null )
        insert( newChild, RIGHT );
      else
        throw new IllegalArgumentException( 
                         "Meer dan 2 kinderen" );
  }
//************************************************************************************************ 
  public E get() 
  {
    return userObject;
  }
//************************************************************************************************ 
  public BKnoop<E> getLeftChild() 
  {
    return leftChild;
  }
//************************************************************************************************ 
  public BKnoop<E> getRightChild() 
  {
    return rightChild;
  }
//************************************************************************************************ 
  public BKnoop<E> getParent()
  {
    return parent;
  }
//************************************************************************************************ 
  public void insert( BKnoop<E> newChild, int childIndex ) 
  {
    if( isAncestor( newChild ) )
      throw new IllegalArgumentException( 
                "Nieuw kind is voorouder" );
    
    if( childIndex != LEFT &&   childIndex != RIGHT )
      throw new IllegalArgumentException(
                "Index moet 0 of 1 zijn" );

     if( newChild != null ) {
      BKnoop<E> oldParent = newChild.getParent();
      if( oldParent != null )
        oldParent.remove( newChild );
    }

    newChild.parent = this;
    if( childIndex == LEFT )
      leftChild = newChild;
    else
      rightChild = newChild;
  }
//************************************************************************************************  
  public boolean isChild( BKnoop<E> aNode ) 
  {
    return aNode == null? 
           false :
           aNode.getParent() == this;
  }
//************************************************************************************************ 
  public boolean isAncestor( BKnoop<E> aNode ) 
  {
    BKnoop<E> ancestor = this;
    while( ancestor != null && ancestor != aNode )
      ancestor = ancestor.getParent();
    return ancestor != null;
  }
//************************************************************************************************ 
  public void remove( BKnoop<E> aChild ) {
    if( aChild == null )
      throw new IllegalArgumentException(
                "Argument is null" );

    if( !isChild( aChild ) )
      throw new IllegalArgumentException(
                "Argument is geen kind" );

    if( aChild == leftChild )
    {
      leftChild.parent = null;
      leftChild = null;
    }
    else
    {
      rightChild.parent = null;
      rightChild = null;
    }
  }
//************************************************************************************************ 
  public String toString() {
    return userObject.toString();
  }
//************************************************************************************************  
  public int aantalKnopen()
  {
	  if(leftChild == null && rightChild ==null)
	  { 
		  return 1;  
	  }
	  if(leftChild != null && rightChild ==null)
	  {
		  
		  return 1 + leftChild.aantalKnopen();
		  
	  }
	  if(leftChild ==null && rightChild!= null)
	  {
		  return  1+ rightChild.aantalKnopen();
	  }
	  else
		  return 1+ leftChild.aantalKnopen()+rightChild.aantalKnopen();
	 
  }
//************************************************************************************************   
  public int aantalBlad()
  {
	  if(leftChild!= null && rightChild !=null)
	  {
		  return leftChild.aantalBlad()+rightChild.aantalBlad();
	  }
	  else
		  return 1;
	  
  }
//************************************************************************************************   
  public int diepte()
  {
	  if(userObject== null)
	  {
		  return -1;
	  }
	  if(leftChild==null)
	  {
		  return 1+rightChild.diepte();
	  }
	  if(rightChild==null)
	  {
		  return 1+ leftChild.diepte();
	  }

	  return Math.max(1 + leftChild.diepte(), 1 + rightChild.diepte());
	  
	  
  }
//************************************************************************************************  
  
  public String preOrder()
  {
	  
	  
	  
  }
//************************************************************************************************  
  
}