package DSA.recursion;

import java.util.Scanner;

public class Factorial {

    public static int fact(int n ){
        if(n==0){
            return 1;
        }
      int val = n*fact(n-1);
      return val;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
        System.out.println(fact(n));
        sc.close();
    }
}
