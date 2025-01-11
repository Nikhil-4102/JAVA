package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_38 {
    
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to Palendrome Checker...");
    System.out.print("Enter Your Number : ");
    int A = sc.nextInt();

    String Result = Palendrome(A) ;
    System.out.println(Result);

   sc.close();
    }

    public static int Reverce(int A){
        int NewNum= 0;
        while (A>0) {
            int Digit = A%10 ;
            NewNum=NewNum *10 + Digit ;
            A = A/10 ;
        }
        return NewNum ;
    }

    public static String Palendrome(int NewNum){
        if(NewNum==Reverce(NewNum)){
            return "Yes it is a Palendrome";
        }
        return "Not a Palendrome " ;

    }


}
