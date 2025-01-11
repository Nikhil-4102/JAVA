package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_12 {
    
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter value of principle : ");
    float P = sc.nextFloat();
    System.out.print("Enter value of Time : ");
    float T = sc.nextFloat();
    System.out.print("Enter value of Rate : ");
    float R = sc.nextFloat();

    float Result = P*R*T/100 ;

    System.out.println("Simple intrest is : "+Result);


  sc.close();
    }
}
