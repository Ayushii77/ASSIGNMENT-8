
public class BSTNode {
	int info;
	BSTNode left;
	BSTNode right;
	public BSTNode(int info)
	{
		this.info=info;
		left=null;
		right=null;
	}
	public void insert(int x)
	{
		if(x<info)
		{
			if(left==null)
			{
				left=new BSTNode(x);
			}
			else
			{
				left.insert(x);
			}
		}
			else if(x>info)
			{
				if(right==null) 
				{
					right=new BSTNode(x);
				}
				else
				{
					right.insert(x);
				}
			}
		}
	public void preOrder()
	{
		System.out.print(info+ " ");
		if(left!=null)
		{
			left.preOrder();
		}
		if(right!=null)
		{
			right.preOrder();
		}
	}
	public void inOrder()
	{
		System.out.print(info+ " ");
		if(left!=null)
		{
			left.inOrder();
		}
		if(right!=null)
		{
			right.inOrder();
		}
	}
	public void postOrder()
	{
		if(left!=null)
		{
			left.postOrder();
		}
		if(right!=null)
		{
			right.postOrder();
		}
		System.out.print(info+ " ");
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTNode X=new BSTNode(8);
		X.insert(4);
		X.insert(7);
		X.insert(3);
		X.insert(8);
		X.insert(5);
		System.out.println("PreOrder traversal: ");
		X.preOrder();
		System.out.println("\ninOrder traversal: ");
		X.inOrder();
		System.out.println("\npostOrder traversal: ");
		X.postOrder();

	}

}
