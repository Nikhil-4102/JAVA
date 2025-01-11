package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_36 {
    public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci series up of first N numbers ...");
        System.out.println("Example : 0,1,1,2,3,5,8,13,21,34,....\n");
        System.out.print("Enter your number :up to ");
        int N = sc.nextInt(); 

        int a = 0 ;
        int b = 1 ;
        int c ;

        System.out.print(a+" ");
        System.out.print(b+" ");
         
        for (int i = 3; i<=N; i++) {
            
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }

        sc.close();
    }

}
