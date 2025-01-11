package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_8 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2st number : ");
        int num2 = sc.nextInt();

        int Add = num1+ num2 ;
        int Sub = num1 - num2 ;
        int Multi = num1 * num2 ;
        float Div = num1 / num2 ;
         
        System.out.println("Addition of "+num1+" and "+num2+" is " +Add);
        System.out.println("Substraction of "+num1+" and "+num2+" is " +Sub);
        System.out.println("Multilication of "+num1+" and "+num2+" is " +Multi);
        System.out.println("Division of "+num1+" and "+num2+" is " +Div);

        sc.close();

    }
}
