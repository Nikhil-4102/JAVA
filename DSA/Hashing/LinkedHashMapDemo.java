package DSA.Hashing;
import java.util.*;

public class LinkedHashMapDemo {
    
        public static void main(String[] args) {

        LinkedHashMap<String,Integer> hm = new LinkedHashMap<>();
        hm.put("IND",120);
        hm.put("CHINA",150);
        hm.put("PAK",100);
        
        Set<String> keys = hm.keySet();
        System.out.println();
        for(String k: keys){
            System.out.println("keys = "+k+", values = "+hm.get(k));
        }
     }
}
