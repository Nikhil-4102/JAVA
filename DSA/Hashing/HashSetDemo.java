package DSA.Hashing;
import java.util.*;

public class HashSetDemo {
      public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
      cities.add("pune");
      cities.add("mumbai");
      cities.add("phaltan");

    //   Iterator it = cities.iterator();
    //   while (it.hasNext()) {
    //     System.out.println(it.next());
    //   }

    for (String city : cities) {
        System.out.println(city);
     }
    }
}
