package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_20 {
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

       System.out.println("Welcome to AGE Diffrentiator ");

       System.out.print("Enter your Age : ");
       int Age = sc.nextInt();

       if(Age>=60){
        System.out.println("Senoir ");
       }else if(Age<60 && Age>=20){
        System.out.println("Adult");
       }else if(Age<20 && Age>=13){
        System.out.println("Teen");
       }
       else{
        System.out.println("Child");
       }

       sc.close();
    }
}
