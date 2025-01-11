import java.util.Scanner;

public class Pattern_1 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        System.out.println("your *'s matrix of " +n+ "x" +m+ " is :");
        
        for( int i=1 ; i<=n ; i++){
           for(int j=1 ; j<=m ; j++){
            System.out.print("*");
           }
           System.out.println();
        }
        scan.close();
     }
}
