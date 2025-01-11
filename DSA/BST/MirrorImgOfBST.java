package DSA.BST;

public class MirrorImgOfBST {
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

     public static Node mirrorImg(Node root){
        if(root==null) return null;
        Node leftMirror = mirrorImg(root.left);
        Node rightMirror = mirrorImg(root.right);
        root.left = rightMirror;
        root.right = leftMirror;

        return root;
     }

     public static void preorder(Node root){ // preorder traversal to check mirror 
        if(root ==null) return ;

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
     }
     public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = insert(root, values[i]);
        }
        System.out.print("inorder traversal : ");
        inorder(root);
        System.out.println();
        System.out.print("preorder traversal : ");
        mirrorImg(root);
        preorder(root);
     } 
}
