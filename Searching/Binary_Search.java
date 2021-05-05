
public class BinarySearch {
	
	public static int search(int arr[], int ele)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==ele)
			{
				return mid;
			}
			if(ele<mid)
			{
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return-1;
	}
	
	public static void main(String args[])
	{
		BinarySearch bs=new BinarySearch();
		int arr[] = {2,4,6,8,10,12,14,16};
		int res = search(arr, 12);
		System.out.println("12 is present at index: " +res);
		
	}
}
