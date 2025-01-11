package DSA.Stack;

import java.util.Stack;

public class Stack_JCF {

  
    
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        
        while(s.empty()==false){
        System.out.println(s.peek());
        s.pop();
        }
    }
}
