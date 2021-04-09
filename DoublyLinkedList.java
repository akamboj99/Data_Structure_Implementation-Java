import java.util.*;
import java.io.*;
public class DoublyLinkedList {
	private ListNode head;
	private ListNode tail;
	private int length;
	
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
	DoublyLinkedList()
	{
		this.head=null;
		this.tail=null;
	}
	
	public boolean isEmpty()
	{
		return length==0;
	}
	
	public int length()
	{
		return length;
	}
	
	public void insertLast(int value)
	{
		ListNode newNode=new ListNode(value);
		if(isEmpty())
		{
			head=newNode;
		}
		else
		{
			tail.next=newNode;
		}
		newNode.previous=tail;
		tail=newNode;
		length++;
	}
	
	public void displayforward()
	{
		if(head==null) {
			return;
		}
		ListNode temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public void displaybackward()
	{
		if(tail==null)
		{
			return;
		}
		ListNode temp=tail;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.previous;
		}
	}
	
	public void insertatfirst()
	{
		Scanner sc=new Scanner(System.in);
		int val;
		System.out.println("Enter the value you want to add at the beginning");
		val=sc.nextInt();
		ListNode newnode=new ListNode(val);
		if(isEmpty())
		{
			tail=newnode;
		}
		else {
			head.previous=newnode;
		}
		newnode.next=head;
		head=newnode;
	}
	
	public void deletefirst()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}
		ListNode temp=head;
		if(head==tail)
		{
			tail=null;
		}
		else {
			head.next.previous=null;
		}
		head=head.next;
		temp.next=null;
		length--;
	}
	
	
	public static void main(String args[])
	{
		DoublyLinkedList dll=new DoublyLinkedList();
		dll.insertLast(1);
		dll.insertLast(10);
		dll.insertLast(15);
		dll.insertLast(25);
		
		dll.displayforward();
		
		dll.displaybackward();
		
		dll.insertatfirst();
		dll.displayforward();
		
		dll.deletefirst();
		dll.displayforward();
	}
}
