import java.util.Scanner;

public class Pattern_2 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        System.out.println("your hollow *'s matrix of " +n+ "x" +m+ " is :");
        
        for( int i=1 ; i<=n ; i++){
           for(int j=1 ; j<=m ; j++){
            if(i==1 || j==1 || i==n || j==m){
                System.out.print("*");
            }
            else{

                System.out.print(" ");
            }
           }
           System.out.println();
           
        }
     }
}
