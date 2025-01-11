package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_23 {
    
        public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to Bitwise XOR operator ");

       System.out.print("Enter your 1st No : ");
       int num1 = sc.nextInt();

       System.out.print("Enter your 2st No : ");
       int num2 = sc.nextInt();

       int Result = num1 ^ num2 ;

       System.out.println(" "+Result);

       sc.close();
    }
}
