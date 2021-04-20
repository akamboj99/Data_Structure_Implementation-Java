public class BinaryTree {
	private TreeNode root;
	
	public class TreeNode{
		private int data;
		private TreeNode left;
		private TreeNode right;
		
		public TreeNode(int data) {
			this.data=data;
		}
	}
	
	public void createBinaryTree()
	{
		TreeNode first=new TreeNode(10);
		TreeNode second=new TreeNode(20);
		TreeNode third=new TreeNode(30);
		TreeNode fourth=new TreeNode(40);
		TreeNode fifth=new TreeNode(50);
		
		root=first;
		first.left=second;
		first.right=third;
		
		second.left=fourth;
		second.right=fifth;
	}
	
	public void preorder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		
		System.out.println(root.data+ " ");
		preorder(root.left);
		preorder(root.right);
		
	}
	
	public static void main(String args[])
	{
		BinaryTree bt=new BinaryTree();
		bt.createBinaryTree();
		bt.preorder(bt.root);
	}
}
