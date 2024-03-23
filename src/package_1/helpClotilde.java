package package_1;
import java.util.*;
//beecrowd problem no 1910

public class helpClotilde {
	static class Edge{//a class to store graph edge
		int source, dest;
		public Edge(int source, int dest) {
			this.source = source;
			this.dest =dest;
		}
	}
	//a class to represent graph object
	static class Graph{
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
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s,d,e,e1;
		ArrayList<ArrayList<Integer>> dlist = new ArrayList<>();
		ArrayList<Integer> l = new ArrayList<>();
		
		for(;;) {
			 s = in.nextInt();//3
			 d = in.nextInt();//8
			 e = in.nextInt();//2
			 
			 if(s==0 && d == 0 && e == 0) break;
			 
			 for(int i =0; i<e; i++) {
				 e1 = in.nextInt();//4,5
				 l.add(e1);
			 }
			 dlist.add(l);
			 System.out.println("Total "+dlist.size()+" List");
			 int x = 0;
			 System.out.println("Number of elements is " +dlist.get(x).size());
			 x++;
			 
			 
			 
		}
	}
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

}
