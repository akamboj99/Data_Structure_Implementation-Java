import java.util.*;

public class Queue {
	private ListNode front;
	private ListNode rear;
	private int length;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data)
		{
			this.data=data;
		}
	}
	
	public Queue()
	{
		this.front=null;
		this.rear=null;
		this.length=0;
	}
	
	public boolean isEmpty()
	{
		return length==0;
	}
	
	public void Enqueue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data you want to add in the queue.");
		int data=sc.nextInt();
		ListNode temp=new ListNode(data);
		if(isEmpty())
		{
			front=temp;
		}
		else {
			rear.next=temp;
		}
		rear=temp;
		length++;
	}
	
	public void display()
	{
		ListNode current=front;
		if(isEmpty())
		{
			return;
		}
		else {
			while(current!=null)
			{
				System.out.println(current.data);
				current=current.next;
			}
		}
	}
	
	
	public static void main(String args[])
	{
		Queue q=new Queue();
		
		q.Enqueue();
		q.Enqueue();
		q.Enqueue();
		
		q.display();
	}
	
}
