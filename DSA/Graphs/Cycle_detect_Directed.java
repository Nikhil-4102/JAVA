package DSA.Graphs;

import java.util.ArrayList;

public class Cycle_detect_Directed {
    
    public static class Edge{
        int src ;
        int dest ; 
        int wt ;
         public Edge(int s , int d , int w){
            this.src  = s ;
            this.dest = d ;
            this.wt = w ;
         }
    }
    public static boolean is_Cycle(ArrayList<Edge>[]graph){
        boolean visited [] = new boolean[graph.length];
        boolean stack [] = new boolean[graph.length];
        for(int i = 0 ; i < graph.length ; i++){
            if(!visited[i]){
                if(is_Cycle_Util(graph , i , visited , stack)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean is_Cycle_Util(ArrayList<Edge>graph [] , int curr , boolean visited [] , boolean stack []){
        visited[curr] = true ;
        stack[curr] = true;
        for(int i = 0 ; i < graph[curr].size() ; i++){
            Edge e = graph[curr].get(i);

            if(stack[e.dest]){
                return true;
            }
            if(!visited[e.dest] && is_Cycle_Util(graph, e.dest, visited, stack)){
                return true ;
            }
        }
        stack[curr] = false ;
        return false;
    }
    public static void main(String[] args) {
        int V = 4 ;
        ArrayList<Edge>graph[] = new ArrayList[V];
        for (int i = 0; i < graph.length; i++) {
            graph[i] =new ArrayList<>();
        }
        graph[1].add(new Edge(1,0,1));
        graph[0].add(new Edge(0,2,1));
        graph[2].add(new Edge(2, 3, 1));
        graph[3].add(new Edge(3, 0, 1));

        System.out.println(is_Cycle(graph));
    }

}
