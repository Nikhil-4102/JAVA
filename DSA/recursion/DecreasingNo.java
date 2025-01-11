package DSA.recursion;

import java.util.Scanner;

public class DecreasingNo {

    public static void decreasingNumbers(int n){

        if(n==1) {
            System.out.println(n);
            return ;
        }

        System.out.print(n + " ");
        decreasingNumbers(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt() ;
        decreasingNumbers(n);
     sc.close();
    }
    
}