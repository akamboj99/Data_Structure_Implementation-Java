
public class BubbleSort {
	
	public void BubbleSort(int arr[])
	{
		boolean isSwapped;
		int n = arr.length;
		for(int i=0; i<n-1;i++)
		{
			isSwapped=false;
			for(int j=0; j<n-1-i; j++)
			{
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					isSwapped=true;
				}
			}
			if(isSwapped==false)
			{
				break;
			}
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
		BubbleSort bs=new BubbleSort();
		bs.BubbleSort(arr);
		bs.print(arr);
	}
}
