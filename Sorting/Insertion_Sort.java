
public class InsertionSort {
	public void InsertionSort(int arr[])
	{
		for(int i=1; i<arr.length;i++)
		{
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}
	
	public void print(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void main(String args[])
	{
		int arr[]= {45,2,3,89,1,0,867,23,34,12};
		InsertionSort iss=new InsertionSort();
		iss.InsertionSort(arr);
		iss.print(arr);
	}
}
