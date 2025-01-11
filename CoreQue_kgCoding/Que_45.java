package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_45 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Reverce the Array ...");
        System.out.print("Enter the Size of Array : ");
        int Size = sc.nextInt() ; 

        int [] Array = new int[Size] ; 

        System.out.println("Now , enter the elements of Array : ");
        for (int i = 0; i < Size; i++) {
            Array[i] = sc.nextInt();
        }
        System.out.println("After reversing the Array ...");

        int [] Result = Reverce(Array);
        System.out.println("your reversed Array is : ");
        for (int i= 0; i < Result.length; i++) {
            System.out.println(+Result[i]);
        }
        
        
        sc.close();
    }

    public static int[] Reverce(int[] Array  ){
    
        for (int i = 0; i < Array.length/2 ; i++) {
            int temp =  Array[i] ;
             Array[i] = Array[(Array.length-1)-i] ;
             Array[(Array.length-1)-i] = temp ;
        } 
        return Array;
    }

}
