
public class CircularLinkedList {
	private ListNode last;
	private int length;
	
	private class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data)
		{
			this.data=data;
		}
	}
	
	public CircularLinkedList()
	{
		last=null;
		length=0;
	}
	
	public int length()
	{
		return length;
	}
	
	public boolean isEmpty()
	{
		return length==0;
	}
	
	public void createCLL()
	{
		ListNode first=new ListNode(1);
		ListNode second=new ListNode(2);
		ListNode third=new ListNode(3);
		ListNode fourth=new ListNode(4);
		
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=first;
		
		last=fourth;
	}
	
	public static void main(String args[])
	{
		CircularLinkedList cll=new CircularLinkedList();
		cll.createCLL();
	}
}
