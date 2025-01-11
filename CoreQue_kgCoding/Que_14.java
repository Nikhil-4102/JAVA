package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_14 {
    
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter value of temp in f : ");
    float f = sc.nextFloat();

    float Result = (f-32)*5/9 ; 

    System.out.println("TEMP in fahrenheit is "+f+" and in celsius is "+Result);
    
    sc.close();
    }
}
