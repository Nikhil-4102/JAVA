package DSA.BitManipulation;
import java.util.*;;

public class BitMask {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        int bitmask = (1<<num)-1;
        System.out.println();
         System.out.print("bitmask of your num : "+bitmask); 
sc.close();
    }
}
