package DSA.Graphs;
import java.util.*;

public class BipartiteGraph {

    public static class Edge{
        int src ;
        int dest;

        Edge(int s , int d){
            this.src = s;
            this.dest = d ;
        }
    } 

    public static boolean isBipartite(ArrayList<Edge> graph[]){
        int colour[] = new int [graph.length];
        for (int i = 0; i < colour.length; i++) {
            colour[i] = -1;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if(colour[i] == -1){
                q.add(i);
                colour[i]  = 0 ;
                while(!q.isEmpty()){
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);
                        if(colour[e.dest] == -1){
                            int nextColor = colour[curr] == 0 ? 1 : 0 ;
                            colour[e.dest] = nextColor;
                            q.add(e.dest);
                        }else if(colour[curr] == colour[e.dest]){
                            return false;
                        }
                    }
                }
            }
        }
        return true ;
    }

    public static void main(String[] args) {
        int V =  5;
        ArrayList<Edge> [] graph = new ArrayList[V];
        for (int i = 0; i < graph.length; i++) {
         graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));

        System.out.println(isBipartite(graph));
    }
    
}
