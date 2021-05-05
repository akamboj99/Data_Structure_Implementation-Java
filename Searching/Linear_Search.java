
public class LinearSearch {
	
	public int search(int arr[], int ele)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(ele==arr[i])
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String args[])
	{
		int arr[]= {34,5,89,77,10,88,2,23,6};
		LinearSearch ls=new LinearSearch();
		int res = ls.search(arr, 23);
		System.out.println("ELement found at: "+res);
	}
}
