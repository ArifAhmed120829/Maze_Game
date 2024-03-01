package package_1;
import java.util.*;
//finding the shortest path between two nodes u and v, with path length measured by the total number of edges.
	class Edge{//a class to store graph edge
		int source, dest;
		public Edge(int source, int dest) {
			this.source = source;
			this.dest =dest;
		}
	}
	//a class to represent graph object
	class Graph{
		// a list of list to represent an adjacency list
		ArrayList<ArrayList<Integer>> adjlist = null;
		Graph(ArrayList<Edge> edges,int n){
			adjlist = new ArrayList<>();
			for(int i = 0; i<n; i++) {
				adjlist.add(new ArrayList<>());	
				}
			//add edges to the undirected graph
			for(Edge edge: edges) {
				int src = edge.source;
				int dest = edge.dest;
				
				adjlist.get(src).add(dest);
				adjlist.get(dest).add(src);
			}
		}
		
	}
public class bfs {
	//perform bfs on the graph starting form vertex v
	public static void BFS(Graph graph,int v, boolean[] discovered) {
		//create a queue for doing bfs
		Queue<Integer> q = new ArrayDeque<>();
		//mark the source vertex as discovered
		discovered[v] = true;
		q.add(v);
		while(!q.isEmpty()) {
			v= q.poll();
			System.out.print(v+" ");
			
			//do for every edge(v,u)
			for(int u: graph.adjlist.get(v)) {
				if(!discovered[u]) {
					discovered[u] = true;
					q.add(u);
				}
			}
			
		}
	}
	public static void main(String[] args) {
		ArrayList<Edge> edges = new ArrayList<>();
		edges.add(new Edge(1,2));
		edges.add( new Edge(1, 3));
		edges.add( new Edge(1, 4));
		edges.add(new Edge(2, 5));
		edges.add( new Edge(2, 6));
		edges.add( new Edge(5, 9));
		edges.add(new Edge(5, 10));
		edges.add( new Edge(4, 7));
		edges.add(  new Edge(4, 8));
		edges.add( new Edge(7, 11));
		edges.add(  new Edge(7, 12));
		int n = 15;
		Graph g = new Graph(edges,n);
		boolean[] discovered = new boolean[n];
		for(int i =0; i<n; i++) {
			if(discovered[i] == false) {
				BFS(g,i,discovered);
			}
		}
 	}

}
