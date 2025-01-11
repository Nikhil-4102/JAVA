package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_27 {
    
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to Bitwise EVEN Or ODD Calculator ");

       System.out.print("Enter your No : ");
       int num1 = sc.nextInt();

       if((num1&1)==0){
             System.out.println("Even");
       }else{
        System.out.println("Odd");
       }

       sc.close();
    }
}
