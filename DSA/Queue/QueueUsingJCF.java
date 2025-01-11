package DSA.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingJCF {
    
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(3);
        q.add(5);
        q.add(7);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
