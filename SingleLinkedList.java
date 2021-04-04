import java.util.*;
import java.io.*;
public class SingleLinkedList {
	private ListNode head;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public void Display()
	{
		ListNode current=head;
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
	}
	
	public void length()
	{
		ListNode current=head;
		int count=0;
		if(head==null)
		{
			System.out.println(0);
		}
		while(current!=null)
		{
			count++;
			current= current.next;
		}
		System.out.println("The Length of the Single Linked List is: "+count);
	}
	
	public void insertfirst()
	{
		int value;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of node you want to insert at the beginning");
		value=sc.nextInt();
		ListNode newnode=new ListNode(value);
		newnode.next=head;
		head=newnode;
		
	}
	
	public static void main(String args[])
	{
		SingleLinkedList sll=new SingleLinkedList();
		sll.head=new ListNode(10);
		ListNode second=new ListNode(8);
		ListNode third=new ListNode(15);
		ListNode fourth=new ListNode(10);
		
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		
		sll.Display();
		sll.length();
		sll.insertfirst();
		sll.Display();
	}
}
