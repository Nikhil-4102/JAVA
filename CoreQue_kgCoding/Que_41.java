package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_41 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Find the occurrences of an elements in this Array ...");

        System.out.print("Enter the size of Array : ");
        int Size = sc.nextInt();

        int [] Arr = new int[Size];
        System.out.println("Enter the elements of Array : ");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sc.nextInt();
        }

        System.out.println("Now , Enter your Num to check his Occurance : ");
        int A = sc.nextInt();

        String Result = Occurance(Arr, A);
        System.out.println(Result);

        sc.close();
    }

    public static String Occurance( int [] Arr ,int A) {
        for (int i = 0; i < Arr.length; i++) {
            if(A==Arr[i]){
                return "Yes ,Your Number is present in this Array " ;
            }
        }
        return "NO , Your Number is NOT present in The Array " ;
    }
}
