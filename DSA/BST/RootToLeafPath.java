package DSA.BST;

import java.util.ArrayList;

public class RootToLeafPath {
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

     public static void inorder(Node root){ // inorder traversal to check it valid BST or NOT IF inorder is sorted then it valid BST
        if(root ==null) return ;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
     }

     public static void printRoot2LeafPath(Node root , ArrayList<Integer> path){
        if(root==null) return;

        path.add(root.data);
        if(root.left==null && root.right==null){
            printPath(path);
        }
        printRoot2LeafPath(root.left, path);
        printRoot2LeafPath(root.right, path);
        path.remove(path.size()-1);
     }
     public static void printPath(ArrayList<Integer> path){
         for(int i = 0 ; i<path.size() ; i++){
            System.out.print(path.get(i)+"->");
         }
         System.out.println("null");
     }
     
     public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        printRoot2LeafPath(root, new ArrayList<>());
     }
}
