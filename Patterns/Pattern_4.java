// print this *
//            **
//            ***  .... as per user times 

import  java.util.*;
public class Pattern_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        System.out.println("your  *'s matrix of upper triangular matrx of " +n+ "x" +n+ " is :");
        for(int  i=n; i>=1 ; i--){
           for(int j=1 ; j<=i ; j++ ){
            System.out.print("*");

           }
           System.out.println();
        }

    }
}
