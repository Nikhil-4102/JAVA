package DSA.Hashing;

import java.util.HashSet;

public class CountDistinctElements {
    
    public static void main(String[] args) {
        int nums[] = {4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> HS = new HashSet<>();
        for (Integer number : nums) {
             HS.add(number);
        }
        System.out.println(HS.size());
    }
}
