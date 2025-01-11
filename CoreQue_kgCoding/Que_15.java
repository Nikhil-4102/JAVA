package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_15 {
    
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        System.out.print(" enter your number : ");

        int A = sc.nextInt();

        if(A==0){
            System.out.println("value A is zero");;
        } 
        else if(A<0) {
            System.out.println("value A is negative");
        }else {
            System.out.println("value A is posotive");
        }

        sc.close();
    }
}
