package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_34 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Checking that given number is prime or not ");
        System.out.print("Enter your number :");
        int A = sc.nextInt();

        System.out.println(Prime(A));
        sc.close();
    }

    public static String Prime(int A){
        if(A<=1) return "Not a Prime Number ";

        for(int i=2 ; i< Math.sqrt(A); i++){
            if(A%i==0){
                return "Not a Prime Number ";
            }
        }
        return "It is a Prime Number "; 
    }
}
