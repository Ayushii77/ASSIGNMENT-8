class TreeNode1
{
	int data;
	TreeNode1 left,right;
	
	public TreeNode1(int data)
	{
		this.data=data;
		left=right=null;
	}
}
public class Q6 {
	TreeNode1 root;
	
	public boolean isBST()
	{
		return false;
		
	}
	private boolean isBST1(TreeNode1 node,int min,int max)
	{
		if(node==null)
		{
			return true;
		}
		if(node.data<min||node.data>max)
		{
			return false;
		}
		return isBST1(node.left,min,node.data-1)&& isBST1(node.right,node.data+1,max);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q6 tree=new Q6();
		tree.root=new TreeNode1(4);
		tree.root.left=new TreeNode1(2);
		tree.root.right=new TreeNode1(8);
		tree.root.left.right=new TreeNode1(1);
		tree.root.right.left=new TreeNode1(12);
		
		if(tree.isBST())
		{
			System.out.println("GIven Binary is a binary search tree");
		}
		else
		{
			System.out.println("Given binary is not a binary search tree");
		}

	}

}
