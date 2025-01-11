package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_28 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Multiplication table...");
        System.out.print("Enter your number : ");

       int A  = sc.nextInt();

       for(int i=1 ; i<=10 ; i++){

        int Result  = A*i ;
        System.out.println(A+" X "+i+" = "+Result);
       }

       sc.close();
    }
}
