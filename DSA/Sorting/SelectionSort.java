package DSA.Sorting;

public class SelectionSort {
    
    public void sort(int[] nums){
       
        int n = nums.length;
        for(int i=0 ; i<n-1 ; i++ ){
            int minIndex =i ;
            for(int j = i+1 ; j<n ; j++){
                if(nums[j]< nums[minIndex]){
                    minIndex = j ;
                }
            }
            swap(nums , minIndex , i);
        }
    }

    private void swap(int[] nums , int i , int j){
         int temp = nums[i];
          nums[i] = nums[j];     
          nums[j] = temp;

    }

    public static void main(String[] args) {
        int [] nums = { 8,4,14,77,43,12};

        SelectionSort SelectionSort = new SelectionSort();
        SelectionSort.sort(nums);

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
