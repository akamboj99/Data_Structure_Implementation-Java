
public class Queue {
	private ListNode front;
	private ListNode rear;
	private int length;
	
	private class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data)
		{
			this.data=data;
		}
	}
	
	public Queue()
	{
		front=null;
		rear=null;
		length=0;
	}
	
	public boolean isEmpty()
	{
		return length==0;
	}
	
}
