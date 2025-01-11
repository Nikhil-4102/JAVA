package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_42 {
    
    public static void main(String[] args) {
         
    Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Find Max & Min elements in this Array ...");

        System.out.print("Enter the size of Array : ");
        int Size = sc.nextInt();

        int [] Arr = new int[Size];
        System.out.println("Enter the elements of Array : ");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sc.nextInt();
        }

        System.out.println("Maximum from this Array is : " +Maxval(Arr));
        System.out.println("Minimum from this Array is : " +Minval(Arr));
       
        sc.close();
    }

    public static int Maxval(int [] Arr ){
        int Max = Arr[0];

        for (int i = 1; i < Arr.length; i++) {
            if(Max < Arr[i]){
              Max = Arr[i] ;
            }
        }
        return Max ;
    }

    public static int Minval(int [] Arr ){
        int Min = Arr[0];

        for (int i = 1; i < Arr.length; i++) {
            if(Arr[i]< Min){
              Min = Arr[i] ;
            }
        }
        return Min ;
    }

}

