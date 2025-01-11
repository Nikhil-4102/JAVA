package DSA.BST;
import java.util.ArrayList;

public class BSTtoBalancedBST {
    
     public static class Node {
          int data;
          Node left ;
          Node right ;
            Node(int data){
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

     public static Node balanceBST(Node root){
        ArrayList<Integer> inorder= new ArrayList<>();
        getInorder(root , inorder);
        root = createBST(inorder,0,inorder.size()-1);
        return root;
     }

     public static void getInorder(Node root , ArrayList<Integer>inorder){
        if(root == null) return ;
        getInorder(root.left, inorder);
        System.out.print(root.data+" ");
        getInorder(root.right, inorder);
     }

     public static Node createBST(ArrayList<Integer>inorder , int start , int end){
        if(start>end) return null;
        int mid = (start+end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder, start, mid-1);
        root.right = createBST(inorder, mid+1, end);
        return root;
     }

     public static void main(String[] args) {
        int values[] = {3,5,6,8,10,11,12};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = insert(root, values[i]);
        }
        balanceBST(root);
     }
}
