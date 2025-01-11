package DSA.Sorting;

public class QuickSort {

    private int partition(int[] nums , int low , int high){

        int pivot = nums[high];
        int i = low;
        for(int j=low ; j<high ; j++){
            if(nums[j]<pivot){
                swap(nums, i, j);
                i++;
            }
        }
        swap(nums, i, high);
        return i ;
    }


    private void quickSort(int[] nums , int low , int high){
         
        if(low < high){
           int partitionIndex = partition(nums , low ,high);
           quickSort(nums, 0, partitionIndex-1);
           quickSort(nums, partitionIndex+1 , high);
        }
    }


    public void sort(int[] nums){
       
       quickSort(nums , 0 , nums.length-1) ;
    }


    private void swap(int[] nums , int i , int j){
         int temp = nums[i];
          nums[i] = nums[j];     
          nums[j] = temp;
    }

    
    public static void main(String[] args) {
        int [] nums = { 8,4,14,77,43,12};

        QuickSort QuickSort = new QuickSort();
        QuickSort.sort(nums);

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
