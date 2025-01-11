package DSA.recursion;
import java.util.*;

public class Fst_And_Last_Occ {
   public static int fst =-1;
   public static int last = -1 ;

    public static void occ(String string ,char element , int index ){
        
        if(index==string.length()){
            System.out.println(fst);
            System.out.println(last);
             return;
        }
        if(element == string.charAt(index)){
            if(fst==-1){
                fst = index ;
            }else{
                last = index;

            }
        }
        occ(string, element, index+1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your stirng : ");
        String string = sc.nextLine();
        System.out.print("Enter your element : ");
        char element = sc.next().charAt(0);
        occ(string , element , 0);
        sc.close();
    }
}
