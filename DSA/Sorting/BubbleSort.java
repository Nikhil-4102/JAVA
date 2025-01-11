package DSA.Sorting;


public class BubbleSort {

    public void sort(int[] nums){

        int n = nums.length;
        for(int i = 0; i< n-1; i++){
            for(int j=0; j<n-1-i;j++){
                if(nums[j]>nums[j+1]){
                    swap(nums , j , j+1);
                }
            }
            printArray(nums);
        }

    }

    private void swap(int[] nums , int i , int j){
        int temp = nums[i];
         nums[i] = nums[j];     
         nums[j] = temp;

   }

   public static void main(String[] args) {
    int [] nums = { 65,7,2,28,31,80,15};

    BubbleSort Bubble = new BubbleSort();
    Bubble.sort(nums);

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
