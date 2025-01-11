package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_18 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

       System.out.println("Welcome to leap year calculator ");

       System.out.print("Enter your year : ");
       int Year = sc.nextInt();

       if(Year%4==0){
        System.out.println("it is A leap year ");
       }else{
        System.out.println("Not a leap Year ");
       }  

       sc.close();
    }
}
