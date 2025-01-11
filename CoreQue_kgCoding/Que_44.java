package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_44 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Returning New Array After deleting Specific element form Original Array  ...");
        System.out.print("Enter the Size of Array : ");
        int Size = sc.nextInt() ; 

        int [] Array = new int[Size] ; 

        System.out.println("Now , enter the elements of Array : ");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }

        System.out.println("Okey , Now enter the element that you want to Delete : ");
        int WantToDelete = sc.nextInt();

        int NewSize = Array.length - WantToDelete;
        int [] newArray = new int[NewSize];

        for (int i = 0; i < Array.length; i++) {
            for(int j=0 ; j<newArray.length ; j++){
                if(Array[i] != WantToDelete){
                    newArray[j] = Array[i];
                }
            }
        }
        System.out.print(newArray);

        sc.close();
    }    
}
