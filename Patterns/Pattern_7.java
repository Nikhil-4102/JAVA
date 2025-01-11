import java.util.Scanner;

public class Pattern_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("......");

        int number = 1 ;

        
        for ( int i=1 ; i<=n ; i++){
            for (int j = 1 ; j<=i ; j++){
                System.out.print(number+" ");
                number++;
                
            }
            System.out.println();
        }
        scan.close();
    }
}