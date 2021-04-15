import java.util.*;

public class Stack {
	private ListNode top;
	private int length;
	
	private class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
		}
	}
	
	public Stack()
	{
		top=null;
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
	
	public void push()
	{
		System.out.println("Enter the element you want to push into the stack");
		Scanner sc=new Scanner(System.in);
		int value=sc.nextInt();
		
		ListNode temp=new ListNode(value);
		temp.next=top;
		top=temp;
		length++;
	}
	
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Empty Stack!!");
		}
		else {
			int result=top.data;
			top=top.next;
			length--;
			System.out.println("Element popped is:" +result);
		}
	}
	
	public void peek()
	{
		if(isEmpty())
		{
			System.out.println("Empty Stack!!");
		}
		else {
			System.out.println("Top most data is:" +top.data);
		}
	}
	
	public static void main(String args[])
	{
		Stack st=new Stack();
    
    // To push elements into stack
		st.push(); 
		st.push();
		st.push();
		st.push();
		
    // To pop elements from stack
		st.pop();
    
    // TO search for the topmost element in the stack
		st.peek();
	}
}
