package DSA.Stack;

import java.util.Stack;

public class PushAtBottom {

    public static void pushBottom(Stack<Integer> s ,int data){
        if(s.empty()==true){
            s.push(data);
            return ;
        }
        
        int top = s.pop();
        pushBottom(s, data);
        s.push(top);
    }
    
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        pushBottom(s, 5);

        while (s.empty()==false) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
