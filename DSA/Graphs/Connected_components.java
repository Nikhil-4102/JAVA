package DSA.Graphs;

import java.util.*;

public class Connected_components {
    
     public static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void BFS(ArrayList<Edge>[] graph){
        boolean [] visited =  new boolean[graph.length];
        for(int i = 0 ; i< graph.length ; i++){
            if(!visited[i]){
                BFSutil(graph, visited);
            }
        }
    }

    public static void BFSutil(ArrayList<Edge>[]graph , boolean visited[]){
            Queue<Integer> q = new LinkedList<>();
            q.add(0);
            while(!q.isEmpty()){
                int curr = q.remove();
                if(!visited[curr]){
                    System.out.print(curr+" ");
                    for(int i = 0 ; i <graph[curr].size() ; i++){
                        Edge e = graph[curr].get(i);
                        q.add(e.dest);
                    }
                }
            }
    }

     public static void main(String[] args) {
        int V = 7 ;
        ArrayList<Edge>[] graph = new ArrayList[V];
        for(int i = 0 ; i< V ; i++){
            graph[i] = new ArrayList<>();
        } 

        graph[0].add(new Edge(0, 1, 5));

        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        graph[3].add(new Edge(3, 2, 1));
        graph[3].add(new Edge(3, 1, 3));

        graph[4].add(new Edge(4, 2, 2));

        BFS(graph);
        
    }
}
