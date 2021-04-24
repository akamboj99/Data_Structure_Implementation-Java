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
		
		System.out.print(root.data+ " ");
		preorder(root.left);
		preorder(root.right);
		
	}
	
	public void inorder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
	
	public void postorder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	
	public static void main(String args[])
	{
		BinaryTree bt=new BinaryTree();
		bt.createBinaryTree();
		
		System.out.println("Pre order Traversal: ");
		bt.preorder(bt.root);
		
		System.out.println("\nIn order Traversal: ");
		bt.inorder(bt.root);
		
		System.out.println("\nPost Order Traversal: ");
		bt.postorder(bt.root);
	}
}
