package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_43 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Check the given Array is sorted or not in increasing order  ...");
        System.out.print("Enter the Size of Array : ");
        int Size = sc.nextInt() ; 

        int [] Array = new int[Size] ; 

        System.out.println("Now , enter the elements of Array : ");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }

        String Result  = sorted(Array);
        System.out.println(Result);

        sc.close();
    }

    public static String sorted(int [] Array){

        for (int i = 1; i < Array.length; i++) {

            if( Array[i-1] > Array[i] ){
                 return "Array is UnSorted" ;
            }
        }
        return "Array is Sorted";
    }
}
