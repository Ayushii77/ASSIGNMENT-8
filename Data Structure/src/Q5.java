class TreeNode
{
	int value;
	TreeNode left;
	TreeNode right;
	public String data;
	
	public TreeNode(int value)
	{
		this.value=value;
		this.left=null;
		this.right=null;
	}
}

public class Q5 {
	TreeNode root;
	 public TreeNode createTree(int[] arr)
	 {
		return root;
	 }
		 private TreeNode createTree(int[]arr,int start,int end)
		 {
			 if(start> end)
				 return root;
			 
			 int mid=(start+end)/2;
			 TreeNode node=new TreeNode(arr[mid]);
			 
			 node.left=createTree(arr,start,mid-1);
			 node.right=createTree(arr,mid+1,end);
			 
			 return node;
		 }
		 public void inOrderTraversal(TreeNode node)
		 {
			 if(node==null)
				 return;
			 
			 inOrderTraversal(node.left);
			 System.out.println(node.data + " ");
			 inOrderTraversal(node.right);
			 
		 }
		 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		Q5 tree=new Q5();
		tree.root=tree.createTree(arr);
		
		System.out.println("INorder Traversal: ");
		tree. inOrderTraversal(tree.root);

	}

}
