import java.util.LinkedList;
import java.util.Scanner;

public class Graphs_AdjacencyList
{
	int V;
	int E;
	LinkedList<Integer>[] adj;
	
	public Graphs_AdjacencyList(int n)
	{
		V = n;
		E = 0;
		adj = new LinkedList[n];
		for(int v=0; v<V;v++)
		{
			adj[v] = new LinkedList<>();
		}
	}
	
	public void addEdge(int u, int v)
	{
		adj[u].add(v);
		adj[v].add(u);
		E++;
	}
	
	public void print()
	{
		System.out.println("No of vartices: "+V  +" and No. of edges :" +E);
		for(int v=0;v<V;v++)
		{
			System.out.print(v+": ");
			for(int w:adj[v])
			{
				System.out.print(w + " ");
			}
			System.out.println("\n");
		}
	}
	
	public static void main(String args[])
	{
		Graphs_AdjacencyList m = new Graphs_AdjacencyList(4);
		m.addEdge(0, 1);
		m.addEdge(1, 2);
		m.addEdge(2, 3);
		m.addEdge(3, 0);

		m.print();
	}
}
