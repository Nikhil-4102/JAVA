package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_40 {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Sum And Avg of all elements in Array ...");

        System.out.print("Enter the Size of the Array : ");
        int Size = sc.nextInt();

        int [] NumArr = new int[Size];

        System.out.print("Enter the Array elements : ");
        for (int i = 0; i<Size; i++) {
            NumArr[i] = sc.nextInt();
        }
        long Sum = Sum(NumArr);
        float Avg = avg(NumArr);
        System.out.println("Sum of all elements is : "+Sum);
        System.out.println("Avg of all elements is : "+Avg);

        sc.close();
    }

    public static int Sum(int[] NewNum ){
        int Sum= 0;
        for (int i = 0; i < NewNum.length; i++) {
            Sum = Sum + NewNum[i];
        }
        return Sum ;
    }

    public static float avg(int [] NewNum){
        float Avg = Sum(NewNum)/NewNum.length ;
        return Avg ;

    }
}
