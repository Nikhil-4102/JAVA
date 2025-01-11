import java.util.Scanner;

public class Pattern_5 {
    
    public static void main(String[] args) {
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();

        for(int i = 1 ; i<=n ; i++){

            for(int j=1 ; j<= n-1 ; j++){
                System.out.print(" ");
            }

            for(int j = 1 ; j<=n ; j++){
                System.out.print(" * ");
            }
        System.out.println();
        }
    }
}
