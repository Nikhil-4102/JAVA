package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_7 {
    

    public static void main(String[] args) {
        
                 Scanner sc = new Scanner(System.in);
         System.out.print("Value of A number : ");
         int A = sc.nextInt();
         
         System.out.print("Value of B number : ");
         int B = sc.nextInt();

         System.out.println("After Swaping ... ");

        int temp = A ;
         A = B ;
         B = temp ;

         System.out.println("A = "+A);
         System.out.println("B = "+B);

       sc.close();

    }
}
