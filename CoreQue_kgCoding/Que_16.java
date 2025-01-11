package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_16 {
    
   public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your Number : ");

    int A = sc.nextInt();


    if(A%2==0){
        System.out.println("A is Even");
    }else{
        System.out.println("A is Odd");
    }

    sc.close();
   }
}
