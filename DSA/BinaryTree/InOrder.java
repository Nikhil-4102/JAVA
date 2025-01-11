package DSA.BinaryTree;

public class InOrder {

    public static class Node {
        int data;
        Node left ;
        Node right;
        Node(int data){
            this.data= data;
            this.left= null;
            this.right = null;
        }    
    }

    public static class inorder {
     static int i = -1 ;
     public Node buildtree(int nodes[]){
         i++;
       if(nodes[i]== -1) return null;

       Node newNode = new Node(nodes[i]);
       newNode.left=buildtree(nodes);
       newNode.right = buildtree(nodes);

       return newNode ;
      }    
    }

    public static void inorderTraversal(Node root){
        if(root == null) return ;
        inorderTraversal(root.left);
        System.out.print(root.data+" ");
        inorderTraversal(root.right);
    }
    
     public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        inorder tree = new inorder();
        Node root = tree.buildtree(nodes);
        System.out.println("root of tree : "+root.data);
        System.out.print("Inorder traversal : ");
        inorderTraversal(root);
     }
}
