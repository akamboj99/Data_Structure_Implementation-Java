
public class MaxPQ {
	Integer[] heap;
	int n;
	
	public MaxPQ(int capacity)
	{
		heap=new Integer[capacity+1];
		n=0;
	}
	
	public boolean IsEmpty() //checking if heap is empty or not
	{
		return n==0;
	}
	
	public int size()
	{
		return n;
	}
	
	public void  insert(int ele)
	{
		if(n==heap.length-1)
		{
			resize(2*heap.length); 
		}
		n++;
		heap[n]=ele;
		swim(n); //calling reheapify method so that max heap properties stay true
	}
	
	private void swim(int k)  //max heap re-heapify method 
	{  
		while(k>1 && heap[k]>heap[k/2])
		{
			int temp=heap[k/2];
			heap[k/2]=heap[k];
			heap[k]=temp;
			k=k/2;
		}
	}

	private void resize(int capacity) {
		Integer[] temp=new Integer[capacity];
		for(int i=0;i<heap.length;i++)
		{
			temp[i]=heap[i];
		}
		heap=temp;
	}
	
	public void printmaxheap()
	{
		for(int i=1; i<=n; i++)
		{
			System.out.println(heap[i]+ " ");
		}
	}

	public static void main(String args[])
	{
		MaxPQ pq=new MaxPQ(3);
		
		//Inserting elements to the heap using max heap properties
		pq.insert(0);
		pq.insert(89);
		pq.insert(5);
		pq.insert(2);
		pq.insert(66);
		pq.insert(77);
		pq.insert(9);
		pq.insert(63);
		pq.insert(1);
		System.out.println(pq.size());
		
		//printing heap
		pq.printmaxheap();
	}
	
}
