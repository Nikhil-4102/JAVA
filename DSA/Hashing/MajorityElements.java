package DSA.Hashing;

import java.util.*;

public class MajorityElements {
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }else{
                hm.put(arr[i], 1);
            }
        }
       Set<Integer> keySet = hm.keySet();
        for (int key : keySet) {
            if(hm.get(key)>arr.length/3){
                System.out.println(key);
            }
        }
    }
    
}
