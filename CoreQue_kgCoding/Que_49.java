package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_49 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Sum And Avg of ALL elements in 2D Array ...");
        System.out.print("Enter the number of Rows : ");
        int Rows = sc.nextInt(); 
        System.out.print("Enter the number of columns : ");
        int Columns = sc.nextInt();
        System.out.println();
        int[][] Arr = new int[Rows][Columns];
        System.out.println("Now , Enter the elements on Array : ");

        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr.length; j++) {
                System.out.print("Row :"+(i+1)+" And Column: "+(j+1)+" element is : ");
                Arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        int Sum = 0 ; 

        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr.length; j++) {
                Sum = Sum + Arr[i][j] ;
            }
        }
        System.out.println("Sum of All elements are : "+Sum);

        int NewSize = Rows * Columns ;
        float Avg = Sum/NewSize ;
        System.out.println("Average of All elements are : "+Avg);
        
        sc.close();
    }

}
