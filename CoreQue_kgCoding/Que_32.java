package CoreQue_kgCoding;
import java.util.Scanner;

public class Que_32 {
    

    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);

    System.out.println(" LCM of 2 Numbers ...");
   
    System.out.print( "\nEnter your 1st number  : ");
    int A  = sc.nextInt(); 

    System.out.print( "Enter your 2st number  : ");
    int B  = sc.nextInt(); 

    System.out.println(LCM(A,B));

    sc.close();
    }

    public static int LCM(int A ,int B){

        for(int i = 1 ; i<=B ; i++ ){
       
            int Fact = A*i ;
            if(Fact%B==0){
                return Fact ;
            }   
        }
        return 0 ;
    }

}
