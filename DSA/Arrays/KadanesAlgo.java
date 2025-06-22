package DSA.Arrays;

public class KadanesAlgo {

    public static int  kadanes(int arr []){
        int ms = Integer.MIN_VALUE; // Maximum sum
        int cs = 0 ;

        for(int i = 0 ; i < arr.length ; i++){
            cs += arr[i];
            if(cs<0){
                cs = 0 ;
            }
            ms = Math.max(ms, cs);

        }
        return ms;
    }
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = kadanes(arr);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
