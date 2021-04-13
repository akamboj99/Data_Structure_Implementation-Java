
public class Merge {
	
	public static void merge(int a1[],int a2[],int n,int m)
	{
		int result[]=new int[n+m];
		int i=0,j=0,k=0;
		while(i<n && j<m)
		{
			if(a1[i]<a2[j])
			{
				result[k++]=a1[i++];
			}
			else
			{
				result[k++]=a2[j++];
			}
		}
		
		while(i<n)
		{
			result[k++]=a1[i++];
		}
		
		while(j<n)
		{
			result[k++]=a2[j++];
		}
		
		System.out.println("The Merged array is: ");
		for(int l=0;l<(n+m);l++)
		{
			System.out.print(result[l]+" ");
		}
	}
	
	public static void main(String args[])
	{
		int a1[]= {1,5,8};
		int a2[]= {2,3,6};
		int n=a1.length;
		int m=a2.length;
		
		merge(a1,a2,n,m);
	}
}
