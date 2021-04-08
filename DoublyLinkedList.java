public class DoublyLinkedList {
	private ListNode head;
	private ListNode tail;
	
	private static class ListNode
	{
		int data;
		ListNode previous;
		ListNode next;
		public ListNode(int data)
		{
			this.data=data;
		}
	}
}
