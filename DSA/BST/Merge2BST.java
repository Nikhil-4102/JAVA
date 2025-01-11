package DSA.BST;
import java.util.ArrayList;

public class Merge2BST {
    public static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
          this.data = data;
        } 
     }
     public static Node insert(Node root , int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            root.left = insert(root.left, val);
        }
        else{
            root.right= insert(root.right, val);
        }
        return root;
     }

     public static void getInorder(Node root , ArrayList<Integer>arr){ // inorder traversal to check it valid BST or NOT IF inorder is sorted then it valid BST
        if(root ==null) return ;
        getInorder(root.left , arr);
         arr.add(root.data);
        getInorder(root.right , arr);
     }

     public static void preorder(Node root){ 
        if(root ==null) return ;
        System.out.print(root.data+" ");
        preorder(root.left );
        preorder(root.right);
     }

     public static Node createBST(ArrayList<Integer>arr , int start , int end){
        if(start>end) return null;
        int mid  = (start+end)/2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, start, mid-1);
        root.right = createBST(arr, mid+1, end);
        return root;
     }

     public static Node mregeNodeBST(Node root1 , Node root2){
        ArrayList<Integer>arr1 = new ArrayList<>();  // create arraylist for 1st tree
        getInorder(root1 , arr1);                    // inorder for tree 1
        ArrayList<Integer>arr2 = new ArrayList<>();  // create arraylist for 2nd tree
        getInorder(root2 ,arr2);                     // inorder for tree 2  
        ArrayList<Integer>finalArr = new ArrayList<>(); // create arraylist for final tree
        int i=0 , j=0 ;                                  
        while(i<arr1.size() && j<arr2.size()){          // compair arrlist-1 and arraylist-2 and add in final arralist
            if(arr1.get(i) <= arr2.get(j)){
                finalArr.add(arr1.get(i));
                i++;
            }else{
                finalArr.add(arr2.get(j));
                j++;
            }
        }
        while (i<arr1.size()) {
            finalArr.add(arr1.get(i));
                i++;
        }
        while (j<arr2.size()) {
            finalArr.add(arr2.get(j));
                j++;
        }
       return createBST(finalArr , 0 , finalArr.size()-1);    // now arraylist is ready then build BST for that final array list
     }
     public static void main(String[] args) {
        int arr1[] = {1,2,4};
        Node root1 = null;
        for(int i=0;i<arr1.length;i++){
            root1 = insert(root1, arr1[i]);
        }

        int arr2[] = {3,9,12};
        Node root2 = null;
        for(int i=0;i<arr2.length;i++){
            root2 = insert(root2, arr2[i]);
        }
      Node root = mregeNodeBST(root1, root2);
      preorder(root);
     }
}
