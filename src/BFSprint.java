import java.util.Scanner;
 
public class BFSprint {

public static void BFS(int edges[][])
{
	boolean visited[] = new boolean[edges.length];
	for(int i=0;i<edges.length;i++)
	{
		if(!visited[i]){
			printBFSHelper(edges ,i ,visited);
		}
	}
}
	
private static void printBFSHelper(int[][] edges, int sv, boolean[] visited) {
	 QueueUsingLL<Integer> q = new  QueueUsingLL<Integer>();
	 q.enqueue(sv);
	 int n= edges.length;
	 visited[sv] = true;
	 while(!q.isEmpty()){
		int front;
		try
		{
            front =q.dequeue();
		}
		 catch(QueueEmptyException e)
		 {
			 return ;
		 }
	System.out.println(front);
	for(int i=0 ;i<n ;i++)
	{
		if(edges[front][i]==1 && !visited[i]){
	         q.enqueue(i);
			visited[i] = true;
		}
	}
 }	
}
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
		
		System.out.println("DFS ");
		printDFS(edges );
		System.out.println("BFS ");
		BFS(edges );
		}

	}


