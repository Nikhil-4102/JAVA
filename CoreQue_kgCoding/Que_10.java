package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_10 {
    
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter length of A : ");
    float A = sc.nextFloat();
    System.out.print("Enter length of B : ");
    float B = sc.nextFloat();
    System.out.print("Enter length of C : ");
    float C = sc.nextFloat();
    System.out.print("Enter length of D : ");
    float D = sc.nextFloat();

    float Result = A+B+C+D ;
    
    System.out.println("Perimeter of rectangle is : "+Result);

    sc.close();
}

}
