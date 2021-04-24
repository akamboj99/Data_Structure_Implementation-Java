public class BinarySearchTree
{
	private TreeNode root;
	
	private class TreeNode
	{
		private TreeNode left;
		private TreeNode right;
		private int data;
		
		public TreeNode(int data)
		{
			this.data = data;
		}
	}
	
	public void insert(int value)
	{
		root = insert(root,value);
	}
	
	public TreeNode insert(TreeNode root, int value)
	{
		if(root==null)
		{
			root = new TreeNode(value);
			return root;
		}
		if(value<root.data)
		{
			root.left = insert(root.left,value);
		}
		if(value>root.data)
		{
			root.right = insert(root.right,value);
		}
		return root;
	}
	
	public void inorder()
	{
		inorder(root);
	}
	
	public void inorder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		inorder(root.left);
		System.out.println(root.data+ " ");
		inorder(root.right);
	}
	
	public static void main(String args[])
	{
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(5);
		bst.insert(2);
		bst.insert(7);
		bst.insert(1);
		bst.insert(10);
		bst.insert(9);
		
		bst.inorder();
		
	}
}
