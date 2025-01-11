package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_24 {
    
        public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.println("To find the Bitwise Complement of a Number (NOT Operator)");

       System.out.print("Enter your No : ");
       int num1 = sc.nextInt();

       int Result = ~num1 ;

       System.out.println(" "+Result);

       sc.close();
    }
}
