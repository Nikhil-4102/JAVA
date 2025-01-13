package DSA.Hashing;

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
    TreeSet<String> cities = new TreeSet<>();
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
