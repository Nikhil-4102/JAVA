package DSA.Hashing;
import java.util.*;

public class TreeMapDemo { 
    public static void main(String[] args) {

        TreeMap<String,Integer> TM = new TreeMap<>();
        TM.put("IND",120);
        TM.put("CHINA",150);
        TM.put("PAK",100);
        
        Set<String> keys = TM.keySet();
        System.out.println();
        for(String k: keys){
            System.out.println("keys = "+k+", values = "+TM.get(k));
        }
     }
}
