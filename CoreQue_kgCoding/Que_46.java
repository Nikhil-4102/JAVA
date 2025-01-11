package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_46 {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("CHECK GIVEN Array is Palindrome or Not ....");
        System.out.print(" Enter the Size of Array : ");
        int Size = sc.nextInt();
        int [] Arr = new int[Size] ; 
        System.out.println("Now , Enter the Array elements : ");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i]  = sc.nextInt();
        }
        System.out.println("... ... ...");

        String  Result = Palindrome(Arr, Size);
        System.out.println("Your Array is "+ Result);

        

     sc.close();
    }

    public static String Palindrome(int [] Arr , int Size ){

        for (int i = 0; i < Arr.length /2; i++) {
            if(Arr[i] != Arr[Arr.length-1-i]){
            return "Not a palindrome " ;
         }
    }
    return "a palindrome";
    }
}
