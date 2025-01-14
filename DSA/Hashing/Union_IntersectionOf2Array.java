package DSA.Hashing;

import java.util.HashSet;

public class Union_IntersectionOf2Array {
    
     public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,6,2,4};
        HashSet<Integer> set = new HashSet<>();
        // union
        for (Integer integer : arr1) {
            set.add(integer);
        }
        for (Integer integer : arr2) {
            set.add(integer);
        }
        System.out.println("Size of union set is : "+set.size());

        set.clear();

        //intersection
        int count = 0 ; 
        for (Integer integer : arr1) {
            set.add(integer);
        }
        for (Integer integer : arr2) {
            if(set.contains(integer)){
                count++;
                set.remove(integer);
            }
        }
        System.out.println("size of intersection set "+ count);
     }
}
