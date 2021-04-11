import java.util.*;
import java.io.*;

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
	
	public void display()
	{
		if(last==null)
		{
			return;
		}
		ListNode first=last.next;
		while(first!=last)
		{
			System.out.println(first.data);
			first=first.next;
		}
		System.out.println(first.data);
	}
	
	public void insertfirst()
	{
		System.out.println("Enter the element you want to insert at the beginning");
		Scanner sc=new Scanner(System.in);
		int val;
		val=sc.nextInt();
		ListNode temp=new ListNode(val);
		if(last==null)
		{
			last=temp;
		}
		else{
			temp.next=last.next;
		}
		last.next=temp;
		length++;
	}
	
	public void insertlast()
	{
		System.out.println("Enter the element you want to insert at the last");
		Scanner sc=new Scanner(System.in);
		int val;
		val=sc.nextInt();
		ListNode temp=new ListNode(val);
		
		if(last==null)
		{
			last=temp;
			last.next=last;
		}
		else {
			temp.next=last.next;
			last.next=temp;
			last=temp;
		}
		length++;
	}
	
	public void deletefirst()
	{
		if(isEmpty())
		{
			return;
		}
		ListNode temp=last.next;
		if(last.next==last)
		{
			last=null;
		}
		else {
			last.next=temp.next;
		}
		temp.next=null;
		length--;
	}
	
	
	public static void main(String args[])
	{
		CircularLinkedList cll=new CircularLinkedList();
		cll.createCLL();
		
		cll.display(); // To print elements of linked list
		
		cll.insertfirst(); //To insert the elements at the beginning  
		cll.display();
		
		cll.insertlast(); //To insert the elements at the last
		cll.display();
		
		cll.deletefirst(); //To delete the first element
		System.out.println("After deleting first node, list looks like:");
		cll.display();
	}
}
