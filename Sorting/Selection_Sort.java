
public class SelectionSort {
	public void SelectionSort(int arr[])
	{
		int n = arr.length;
		for(int i = 0; i < n-1; i++)
		{
			int min = i;
			for(int j = i+1; j < n; j++)
			{
				if(arr[j]<arr[min])
				{
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
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
		SelectionSort ss=new SelectionSort();
		ss.SelectionSort(arr);
		ss.print(arr);
	}
}
