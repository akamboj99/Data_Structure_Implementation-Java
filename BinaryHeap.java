
public class MaxPQ {
	Integer[] heap;
	int n;
	
	public MaxPQ(int capacity)
	{
		heap=new Integer[capacity+1];
		n=0;
	}
	
	public boolean IsEmpty()
	{
		return n==0;
	}
	
	public int size()
	{
		return n;
	}
	
	public static void main(String args[])
	{
		MaxPQ pq=new MaxPQ(3);
		System.out.println(pq.IsEmpty());
		System.out.println(pq.size());
	}
	
}
