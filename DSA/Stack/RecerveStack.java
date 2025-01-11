package DSA.Stack;

import java.util.Stack;

public class RecerveStack {

    public static String Reverse(String s){
         Stack<Character> stack = new Stack<>();
        int i = 0 ; 
        while(i<s.length()){
            stack.push(s.charAt(i));
            i++;
        }

        StringBuilder SB  = new StringBuilder();
        while (stack.empty()==false) {
            char curr = stack.pop();
            SB.append(curr);
        }
        String str = SB.toString();
        return str;
    }
    
   public static void main(String[] args) {
        String s = "nikhil";
        System.out.println(Reverse(s));;
    }
}    
