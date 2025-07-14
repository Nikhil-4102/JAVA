package DSA.Sorting;

public class QuickSort {
    
    public static void quickSort(int[] nums , int si , int ei) {
        if(si>= ei){
            return ;
        }
            int pivotIndex = partition(nums, si, ei);
            quickSort(nums, si, pivotIndex - 1);
            quickSort(nums, pivotIndex + 1, ei);
        
    }

    public static int partition(int[] nums, int si, int ei) {
       int pivot = nums[ei];
       int i = si-1;
       for(int j = si ; j<ei ; j++){
           if(nums[j] <= pivot){
            i++;
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
           }
       }
       i++;
       int temp= pivot ;
       nums[ei] = nums[i];
       nums[i] = temp;    
       
       return i;
    }
  
    
    public static void main(String[] args) {
        int [] nums = { 8,4,14,77,43,12};

        quickSort(nums, 0, nums.length - 1);
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
