package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_19 {
    
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

       System.out.println("Welcome to Marking System ");

       System.out.print("Enter your Marks : ");
       int Marks = sc.nextInt();

       if(Marks>90){
        System.out.println("Congragulations You get A grade ");
       }else if(Marks>75){
        System.out.println("You get B grade ");
       }else if(Marks>60){
        System.out.println("You get C grade ");
       }else if(Marks>30){
        System.out.println("You get D grade ");
       }else{
        System.out.println("You get F grade ");
       }

       sc.close();
    }
}
