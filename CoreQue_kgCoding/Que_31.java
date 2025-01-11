package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_31 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Sum of digits of Given Number  ...");
        System.out.print( "\nEnter your number  : ");

    int N  = sc.nextInt();
    
    int Sum= 0 ;
    while (N>0) {
        Sum = Sum + (N%10);
        N = N /10 ; 
    }

    System.out.println("Sum of all digits in given Number is "+Sum);
    
    sc.close();
    }
}
