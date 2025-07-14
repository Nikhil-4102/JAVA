package DSA.Sorting;

public class MergeSort {
 
    public static int[] mergeSort(int[] nums) {
      ms(nums,0, nums.length-1);
       return nums; 
    }

    public static void ms(int nums[] , int si , int ei){ 
        if(si >= ei) {
            return; // Base case: if the subarray has one or no elements, it's already sorted
        }
      int mid = si + (ei-si)/2 ;
      ms(nums , si , mid);
      ms(nums , mid+1 , ei);
      merge(nums, si , mid ,ei);
    }

    public static void merge(int nums[] , int si , int mid , int ei){
        int temp[] = new int[ei-si+1];
        int i= si , j = mid+1 , k=0 ;

        while(i<=mid && j<=ei){
              if(nums[i] < nums[j]){
                temp[k++] = nums[i++];
              }else{
                temp[k++] = nums[j++];
              }
        }
        while(i<= mid){
            temp[k++] = nums[i++];
        }
        while(j<= ei){
            temp[k++] = nums[j++];
        }
        for(k= 0 , i=si ; k<temp.length ; k++,i++){
            nums[i] = temp[k];
        }
    }
   

 public static void main(String[] args) {

        int [] nums = {8,4,14,77,43,12};
        mergeSort(nums);
        System.out.print("Sorted Aarray : ");
        printArray(nums); 
    }

   private static void printArray(int[] nums){
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
