package DSA.Hashing;

import java.util.HashMap;

public class LargestSubArrayWith0sum {
    
    
    public static void main(String[] args) {
        int arr[] = {15,-2,2,-8,1,7,10,23};
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0,l = 0 ;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
            if(map.containsKey(sum)){
                l = Math.max(l , i-map.get(sum));
            }else{
                map.put(sum, i);
            }
        }
        System.out.println("largest subarr length with sum 0 : "+l);
    }
}
