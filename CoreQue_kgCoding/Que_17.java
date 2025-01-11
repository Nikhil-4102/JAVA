package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_17 {
    public static void main(String[] args) {
         
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter 1st number : ");
    float num1 = sc.nextFloat();
    System.out.print("Enter 2st number : ");
    float num2 = sc.nextFloat();
    System.out.print("Enter 3st number : ");
    float num3 = sc.nextFloat();

    if(num1>=num2 && num1>=num3){
        System.out.println(num1+" is greatest");
    }
    else if (num2>=num3){
        System.out.println(num2+" is greatest");
    }
    else{
        System.out.println(num3+" is greatest");
    }


    sc.close();
    }
}
