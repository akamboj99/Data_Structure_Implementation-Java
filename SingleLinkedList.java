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
		System.out.println("Enter the value of node you want to insert ");
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
			System.out.println("No element found!!");
		}
		else
		{
			ListNode temp=head;
			head=head.next;
			temp.next=null;
			System.out.println("The element deleted is:"+temp.data);
		}
	}
	
	public void deletelast()
	{
		if(head==null || head.next==null)
		{
			System.out.println("No element found!!");
		}
		ListNode current=head;
		ListNode previous=null;
		while(current.next!=null)
		{
			previous=current;
			current=current.next;
		}
		previous.next=null;
		System.out.println("The element deleted from last is:"+current.data);
	}
	
	public void delete()
	{
		int pos;
        int count=1; 
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the position where you want to delete the node");
        pos=sc.nextInt();
		if(pos==1)
		{
			head=head.next;
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
			previous.next=current.next;
		}
	}
	
	public boolean search()
	{
		int element;
		Scanner sc=new Scanner(System.in);
		
		if(head==null) {
			return false;
		}

        System.out.println("Enter the element you want to search");
        element=sc.nextInt();
		ListNode current= head;
		
		while(current!=null)
		{
			if(current.data==element)
			{
				return true;
			}
			current=current.next;
		}
		return false;
	}
	
	public void reverse()
	{
		ListNode current=head;
		ListNode previous=null;
		ListNode next=null;
		
		while(current!=null)
		{
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		printreverse(previous);
	}
	
	public void printreverse(ListNode previous)
	{
		ListNode current=previous;
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
	}
	
	public void middle()
	{
		ListNode slowptr=head;
		ListNode fastptr=head;
		while(fastptr!=null && fastptr.next!=null)
		{
			slowptr=slowptr.next;
			fastptr=fastptr.next.next;
		}
		System.out.println("The middle element is: "+slowptr.data);
	}
	
	public void nthnode()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the node you want to find from the end");
		int n=sc.nextInt();
		ListNode mainptr=head;
		ListNode refptr=head;
		int count=0;
		while(count<n)
		{
			refptr=refptr.next;
			count++;
		}
		
		while(refptr!=null)
		{
			mainptr=mainptr.next;
			refptr=refptr.next;
		}
		
		System.out.println("The value at "+n+" position from the end is:"+mainptr.data);
	}
	
	public void removeitem_bykey()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element you want to delete");
		int key=sc.nextInt();
		
		ListNode current=head;
		ListNode previous=null;
		
		if(current!=null && current.data==key)
		{
			head=current.next;
			return;
		}
		
		while(current!=null && current.data!=key)
		{
			previous=current;
			current=current.next;
		}
		if(current==null)
		{
			return;
		}
			previous.next=current.next;
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
		
		sll.insertfirst(); // To insert element at beginning
		sll.Display();
		
		sll.insertlast(); // To insert element at the end
		sll.Display();
		
		sll.insert(); // To insert element at the given position
		sll.Display();
		
		sll.deletefirst(); //To delete the first element of the linked list
		sll.Display();
		
		sll.deletelast(); //To delete the last element of the linked list
		sll.Display();
		
		sll.delete(); //To delete the element at the given position
		sll.Display();
		
		if(sll.search()) // To search if the element exists or not
		{
			System.out.println("Element found!!");
		}
		else {
			System.out.println("Not element found!!");
		}
		
		sll.reverse(); //To reverse the linked list
		
		sll.middle(); // To find the middle element 
		
		sll.nthnode();
		
		sll.removeitem_bykey(); // Remove element by its value
		sll.Display();
	}
}
