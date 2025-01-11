package DSA.recursion;
import java.util.*;

public class ReverseString{

    public static void revString(String string , int index){
        if(index==0){
            System.out.println(string.charAt(index));
            return ;
        }
        
        System.out.print(string.charAt(index));
        revString(string, index-1);
    }

   public static void main(String arg []){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your String : ");
    String string = sc.nextLine();
      revString(string, string.length()-1);
    sc.close();
   }
}