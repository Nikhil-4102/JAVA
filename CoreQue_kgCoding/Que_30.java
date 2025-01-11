package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_30 {
    
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

        System.out.println("Factorial of N odd numbers ...");
        System.out.print("Enter your number  : \n");

    int N  = sc.nextInt();
    
    long Result = Fact(N) ;

    System.out.println("Factorial of 1st "+N+" Numbers is : "+Result);
    
    sc.close();
    }

    public static long Fact(int N){

        if(N==0){
            return 1;
        }else if(N==1){
            return 1;
        }
        return N*Fact(N-1);
    }
}

