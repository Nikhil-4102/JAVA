package CoreQue_kgCoding;

import java.util.Scanner;

public class Que_33 {
    
    public static void main(String[] args)  {
        
     Scanner sc = new Scanner(System.in);

    System.out.println(" GCD of 2 Numbers ...");
   
    System.out.print( "\nEnter your 1st number  : ");
    int A  = sc.nextInt(); 

    System.out.print( "Enter your 2st number  : ");
    int B  = sc.nextInt(); 

    System.out.println(GCD(A,B));

    sc.close();
    }
     
    public static int GCD(int A , int B){
       int Factor = 1 ;
       int Smallest= Math.min(A,B);
       for(int i = 2 ; i<=Smallest ; i++){
         if (A%i==0 && B%i==0){
            Factor = i ;
         }
       }
      return Factor ;

    }
}
