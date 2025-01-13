package DSA.Hashing;

import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
    LinkedHashSet<String> cities = new LinkedHashSet<>();
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
