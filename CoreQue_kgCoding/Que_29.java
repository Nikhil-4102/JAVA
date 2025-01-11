package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_29 {
    
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

        System.out.println("Addition of N odd numbers ...");
        System.out.print("Enter your number  : ");

       int N  = sc.nextInt();
       int sum = 0;
       
       for (int i=1 ; i<= N ; i+=2 ){
       sum = sum+i ;
       }
       System.out.println(sum);

       sc.close();
    }
}
