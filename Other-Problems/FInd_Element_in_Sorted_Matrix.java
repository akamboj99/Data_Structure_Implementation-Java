
public class SortedMatrix {
	
	public void search(int[][] matrix, int n, int key)
	{
		int i=0;
		int j=n-1;
		while(i<n && j>=0)
		{
			if(matrix[i][j] == key)
			{
				System.out.println(key + " found at " + i+","+j);
				return;
			}
			if(matrix[i][j]>key)
			{
				j--;
			}
			else {
				i++;
			}
		}
		System.out.println("No Element found!! ");
	}
	
	public static void main(String[] args)
	{
		int [][] matrix= {
				           {10,20,30,40},
				           {15,25,35,45},
				           {27,29,37,48},
				           {32,33,39,51}
		                 };
		SortedMatrix sm=new SortedMatrix();
		sm.search(matrix, matrix.length,32);
	}
}
