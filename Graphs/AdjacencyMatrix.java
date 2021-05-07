
public class Graphs_AdjacencyMatrix {
	
	private int[][] adjMatrix;
	private int V;
	private int E;
	
	public Graphs_AdjacencyMatrix(int n)
	{
		this.V=n;
		this.E=0;
		this.adjMatrix=new int[n][n];
	}
	
	public void addEdge(int u, int v)
	{
		adjMatrix[u][v]=1;
		adjMatrix[v][u]=1;
		E++;
	}
	
	public void print()
	{
		System.out.println("No of vartices: "+V  +" and No. of edges :" +E);
		for(int i=0;i<V;i++)
		{
			for(int j : adjMatrix[i])
			{
				System.out.print(j + " ");
			}
			System.out.println("\n");
		}
	}
	
	public static void main(String args[])
	{
		Graphs_AdjacencyMatrix gac = new Graphs_AdjacencyMatrix(4);
		gac.addEdge(0, 1);
		gac.addEdge(1, 2);
		gac.addEdge(2, 3);
		gac.addEdge(3, 0);
		
		gac.print();
	}
	
}
