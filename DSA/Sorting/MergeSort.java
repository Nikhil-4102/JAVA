package DSA.Sorting;

public class MergeSort {

    private void mergeSort(int[] nums){
        int n = nums.length;
        if(n<2){
        return;
        }
        
        int mid = n/2;
        int [] left = new int[mid];
        int [] right = new int[n - mid];
       
        for(int i=0; i<mid ; i++){
            left[i] = nums[i] ;
        }
        for(int i= mid ; i<n ; i++){
            right[i-mid] = nums[i] ;
        }

        mergeSort(left);
        mergeSort(right);

        merge(nums , left , right );

    }

  private void merge(int[] result , int[] first , int[] second){
      
        int i=0 , j=0 , k=0 ;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
               result[k]=first[i];
               k++;
               i++;
            }else{
                result[k] = second[j];
                 k++;
                 j++;
            }    
        }
        while (i<first.length) {
            result[k++] = first[i++]  ;
        }
        while (j<second.length) {
            result[k++] = second[j++]  ;
        }
    }

  public void sort(int[] nums){    
    mergeSort(nums);
     }

 public static void main(String[] args) {
        int [] nums = { 8,4,14,77,43,12};

        MergeSort merg = new MergeSort();
        merg.sort(nums);

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
