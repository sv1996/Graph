import java.util.Scanner;

public class Graph {
	public static void printDFS(int edges[][])
	{
		
		boolean visited[] =new boolean[edges.length];
		for(int i=0 ; i<edges.length ;i++)
		{
			if(!visited[i]){
				printHelperDFS(edges , i , visited);
			}
	}
		
}
	

	private static void printHelperDFS(int[][] edges, int sv, boolean[] visited) {
	 System.out.println(sv);
	 visited[sv]= true;
	 int n= edges.length;
	 for(int i=0 ; i<n ;i++)
	 {
		 if(edges[sv][i] ==1 && !visited[i]){
			 printHelperDFS(edges , i, visited);
		 }
	 }
	}


	public static void main(String[] args) {
	int n;
	int e;
	Scanner  s = new Scanner(System.in);
	n=s.nextInt();
	e=s.nextInt();
	int edges[][] = new int [n][n];
	for(int i=0 ; i< e; i++)
	{
		int fv = s.nextInt();
		int sv=s.nextInt();
		edges[fv][sv]=1;
		edges[sv][fv]=1;
	}
	
	printDFS(edges );
	

	}

}
