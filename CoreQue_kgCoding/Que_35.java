package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_35 {
    
    public static void main(String[] args) {
       
    Scanner sc = new Scanner(System.in);
        System.out.println("Reversing the Digits of the Given Number...");
        System.out.print("Enter your number :");
        int N = sc.nextInt();

    int NewNum= 0 ;
    while (N>0) {
        int Digit = N%10 ;
        NewNum = NewNum * 10 + Digit;
        N = N/10;

    }

    System.out.println("After the reversing of Number ... "+NewNum);
    
    sc.close();
    }
}
