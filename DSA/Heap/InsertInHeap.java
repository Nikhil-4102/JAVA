package DSA.Heap;

import java.util.ArrayList;

public class InsertInHeap {
    
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();
         public void add(int data){
            arr.add(data);
            int x = arr.size()-1;
            int parent = (x-1)/2; 

            while (arr.get(x)<arr.get(parent)) {
                int temp = arr.get(x);
                 arr.set(x,arr.get(parent));
                 arr.set(parent, temp);
                 x = parent;
                 parent = (x-1)/2;
            }
         }
    }
    public static void main(String[] args) {
        
    }
}
