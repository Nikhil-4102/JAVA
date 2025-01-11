package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_48 {
    
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
         System.out.println("Search element in 2D Array ....");
        System.out.print("Enter the Numbers of Rows in Array : ");
        int Rows= sc.nextInt();
        System.out.print("Enter the Numbers of Columns in Array : ");
        int Columns= sc.nextInt();
        System.out.println();
        
        int [][] Arr = new int[Rows][Columns] ; 
        System.out.println("Now , Enter the elements of Array : ");
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr.length; j++) {
                System.out.print("Row :"+(i+1)+" and column :"+(j+1)+" element is : ");
                Arr [i][j] = sc.nextInt();
            }
            System.out.println();
        } 

        System.out.print("Enter your element to Search :");
        int choice = sc.nextInt();

        String Result = Search(Arr, choice);
        System.out.println(Result);


        sc.close(); 
    }

    public static String  Search(int[][] Arr , int choice ){
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr.length; j++) {
                if(choice==Arr[i][j]){
                    return " Yes, your number is present at Row:"+(i+1)+" And Column:"+(j+1)+" Position ." ;
                }
            }
        }
      return " No, your element is Not Present ";
    }
        
}

