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
	
	public void insertlast()
	{
		int value;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of node you want to insert at the end");
		value=sc.nextInt();
		ListNode newnode=new ListNode(value);
		if(head==null)
		{
			head=newnode;
			return;
		}
		ListNode current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=newnode;
	}
	
	public void insert()
	{
		int value,pos;
                int count=1; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of node you want to insert at the end");
		value=sc.nextInt();
		System.out.println("Enter the position where you want to insert the node");
		pos=sc.nextInt();
		
		ListNode node=new ListNode(value);
		if(pos==1)
		{
			node.next=head;
			head=node;
		}
		else
		{
			ListNode previous=head;
			while(count<pos-1)
			{
				previous=previous.next;
				count++;
			}
			ListNode current=previous.next;
			node.next=current;
			previous.next=node;
		}
	}
	
	public void deletefirst()
	{
		if(head==null)
		{
			System.out.println("No element found");
		}
		else
		{
			ListNode temp=head;
			head=head.next;
			temp.next=null;
			System.out.println("The element deleted is:"+temp.data);
		}
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
		
		sll.Display(); //To display the elements of the linked list
		
		sll.length(); //To display the length of linked list
		
		sll.insertfirst(); // To Insert element at beginning
		sll.Display();
		
		sll.insertlast(); // To Insert element at the end
		sll.Display();
		
		sll.insert(); // To Insert element at the given position
		sll.Display();
		
		sll.deletefirst(); //To delete the first element of the linked list
		sll.Display();
	}
}
