import java.util.*;
import java.io.*;

public class Arrays {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter the size of array");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		display(arr); //To print array elements
		
		reverse(arr); //To reverse the array elements
		
		min_element(arr); //To find minimum elements
		
		movezero(arr); //Move all zeros at the end
	}
	
	public static void movezero(int arr[])
	{
		int n=arr.length;
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=0 && arr[j]==0)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			if(arr[j]!=0)
			{
				j++;
			}
		}
		System.out.println("After moving zero to end, array looks like:");
		display(arr);
	}
	
	public static void min_element(int arr[])
	{
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum element is:"+ min);
	}
	
	public static void reverse(int arr[])
	{
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		System.out.println("Array after reversing is: ");
		display(arr);
	}
	
	public static void display(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	
}
