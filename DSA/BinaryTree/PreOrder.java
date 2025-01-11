package DSA.BinaryTree;


public class PreOrder {
    
    static class Node{
        int data ;
        Node left ;
        Node right ;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

     static class preorder {
         static int i  = -1 ;
         public Node buildTree(int nodes[]){
            i++;
            if(nodes[i] == -1) return null;

            Node newNode = new Node(nodes[i]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
         }
        
    }

    public static void preorderTraversal(Node root){
        if(root ==null){
            return;
        }
        System.out.print(root.data+" ");
        preorderTraversal( root.left);
        preorderTraversal(root.right);
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        preorder tree = new preorder();
        Node root = tree.buildTree(nodes);
        System.out.println("Root of tree : "+root.data);
        System.out.print("preorder Traversal : ");
        preorderTraversal(root);
    }
}
