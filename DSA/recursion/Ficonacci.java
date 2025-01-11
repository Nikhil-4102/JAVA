package DSA.recursion;

import java.util.Scanner;

public class Ficonacci {

    public static int fib(int n ){
        if(n==0) return 0;
        if(n==1) return 1;
        int fn = fib(n-1)+ fib(n-2);
        return fn ;
    }
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
        System.out.println(n+"th finonacci no is : "+fib(n));

        sc.close();
    }
}
