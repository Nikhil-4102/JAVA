package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_13 {
    
     public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter value of principle : ");
    float P = sc.nextFloat();
    System.out.print("Enter value of Time : ");
    float T = sc.nextFloat();
    System.out.print("Enter value of Rate : ");
    float R = sc.nextFloat();

    float Result = P*(1+(R/100))*T ;

    System.out.println("Compound intrest is : "+Result);


    sc.close();
    }

}
