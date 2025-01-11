package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_37 {
    
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
        System.out.println("Check Number is Divisible by its Sum of Digits Or Not ...");

        System.out.print("Enter your number : ");
        int N = sc.nextInt();
        
        int Sum = 0 ;
        while (N>0) {
            Sum = Sum + (N%10);
            N = N/10 ;
        }
        System.out.println("Sum of digits of given No. "+Sum);
        System.out.println();

        if(N%Sum==0){
            System.out.println("It is Divisible Number");
        }else{
            System.out.println("Not a Divisible ");
        }

        sc.close();
    }
}
