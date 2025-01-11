package DSA.BinaryTree;

public class PostOrder {
    
    public static class Node {
           int data ;
           Node left ;
           Node right ;
           Node(int data){
            this.data = data;
            this.left = null;
            this.right= null;
           } 
    }

    public static class postorder {
        static int i  = -1 ;
        public Node buildTree(int arr[]){
           i++;
           if(arr[i] == -1) return null;

           Node newNode = new Node(arr[i]);
           newNode.left=buildTree(arr);
           newNode.right=buildTree(arr);

           return newNode;
        }    
   }
    public static void postorderTraversal(Node root){
        if(root ==null) return;

        postorderTraversal(root.left);
        postorderTraversal( root.right);
        System.out.print(root.data+ " ");  
    }


    public static void main(String[] args) {
        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        postorder tree = new postorder();
        Node root = tree.buildTree(arr);
        System.out.println("root of tree : "+root.data);
        System.out.print("PostOrder traversal : ");
        postorderTraversal(root);
    }
}
