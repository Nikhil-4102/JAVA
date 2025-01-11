package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_11 {
    
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter length of A : ");
    float A = sc.nextFloat();
    System.out.print("Enter breadth of B : ");
    float B = sc.nextFloat();

    float Area = (A*B /2) ;

    System.out.println( "Area of triangle ABC is : " +Area); 

     sc.close();
    }
}
