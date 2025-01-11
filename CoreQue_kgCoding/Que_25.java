package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_25 {
    
    public static void main(String[] args) {
        
          Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to Left Shift operator ");

       System.out.print("Enter your 1st No : ");
       int num1 = sc.nextInt();

       int Result = num1 << 1;

       System.out.println(" "+Result);

       sc.close();
    }
}
