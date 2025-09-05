package DSA.Graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prims {
    
     public static class  Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static class  Pair implements Comparable<Pair> {
        int v ; 
        int cost ;
          public Pair(int v , int cost){
            this.v = v;
            this.cost = cost;
          }

        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost ;
        }    
    }

    public static int prims(ArrayList<Edge>graph[]){
         boolean visited[] = new boolean[graph.length];
         PriorityQueue<Pair> pq = new PriorityQueue<>();
        int finalCost = 0 ;
        
        pq.add(new Pair(0, 0));
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if(!visited[curr.v]){
                visited[curr.v] = true;
                finalCost += curr.cost;
                for(int i = 0 ; i< graph[curr.v].size() ; i++){
                    Edge e = graph[curr.v].get(i);
                    pq.add(new Pair(e.dest , e.wt));
                }
            }
        }
        return finalCost;
    }
    public static void main(String[] args) {
        
         int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
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
        
        System.out.println(prims(graph));
    }

}
