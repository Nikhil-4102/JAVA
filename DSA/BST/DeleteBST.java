package DSA.BST;

public class DeleteBST {
    
    public static class Node{
        int data ;
        Node left ;
        Node right;
        public Node(int data){
            this.data= data;
        }
    }
    public static Node insert(Node root ,int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
      return root;
    }
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static Node delete(Node root , int val){
        if(root.data > val){
            root.left = delete(root.left , val);
        }
        else if(root.data < val){
            root.right = delete(root.right , val);
        }else{
            // case where we found val = root.data
            // condition -1 ---> No chldren
            if(root.left == null && root.right == null){
                return null ;
            }
            // condition -2 ---> 1 child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            // condition -3 --->
            Node IS = findInorderSuccesser(root.right);
            root.data = IS.data;
            root.right = delete(root.right , IS.data);
        }
        return root ;
    }

    public static Node findInorderSuccesser(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

   
    public static void main(String[] args) {
        int values[]= {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i = 0 ; i <values.length;i++){
            root = insert(root , values[i]);
        }

        inorder(root);
        System.out.println();
 
        delete(root, 6);
        System.out.println("after deleting ...");
        inorder(root);
    } 
}
