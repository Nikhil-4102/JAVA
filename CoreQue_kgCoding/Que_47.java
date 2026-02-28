package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_47 {
    
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         System.out.println("Merge two Sorted Arrays ....");
        System.out.print(" Enter the Size of 1st Array : ");
        int Size1 = sc.nextInt();
        int [] Arr1 = new int[Size1] ; 
        System.out.println("Now , Enter the elements of 1st Array : ");
        for (int i = 0; i < Arr1.length; i++) {
            Arr1[i]  = sc.nextInt();
        }        

        System.out.print(" Enter the Size of 2st Array : ");
        int Size2 = sc.nextInt();
        int [] Arr2 = new int[Size2] ; 
        System.out.println("Now , Enter the elements of 2nd Array : ");
        for (int i = 0; i < Arr2.length; i++) {
            Arr2[i]  = sc.nextInt();
        }    

        int [] Result = Sorted(Arr1, Arr2);
        System.out.println("Your New Merged And Sorted Array is : ");
        for(int k= 0; k<Result.length ;k++){
            System.out.print(Result[k] + " ");
        }

        sc.close();
    }

    public static int [] Sorted(int [] Arr1 ,int [] Arr2 ){
       int NewSize = Arr1.length + Arr2.length ; 
       int[] NewArr = new int[NewSize];
       int i=0 ,j=0 , k=0 ;
       while (i<Arr1.length && j<Arr2.length) {
         if(Arr1[i]<Arr2[j]){
            NewArr[k++] = Arr1[i++];
         }else{
            NewArr[k++] = Arr2[j++];
         }
       }
       while(i<Arr1.length){
        NewArr[k++] = Arr1[i++];
       }
       while(j<Arr2.length){
        NewArr[k++] = Arr2[j++];
       }

    return NewArr ;
    }
}
