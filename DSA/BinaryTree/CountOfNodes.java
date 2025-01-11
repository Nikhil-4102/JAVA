package DSA.BinaryTree;

public class CountOfNodes {
    
    static class Node {
        int data ;
        Node left;
        Node right ;
          Node(int data){
              this.data = data ;
              this.left = null;
              this.right = null;
          }   
   }
   public static class binaryTree {
      static int i = -1;
      public Node buildTree(int nodes[]){
          i++;
          if(nodes[i]==-1) return null;
          Node newNode = new Node(nodes[i]);
          newNode.left = buildTree(nodes);
          newNode.right = buildTree(nodes);

          return newNode;
      }
   }

   public static int count(Node root){
      if(root==null) return 0;

      int lc = count(root.left);
      int rc = count(root.right);
      int count = lc + rc + 1 ;

      return count;
   }
 
   public static void main(String[] args) {
      int nodes[] = { 1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
      binaryTree tree = new binaryTree();
      Node root = tree.buildTree(nodes);
      System.out.println("Root of tree : "+root.data);

      System.out.println("count of nodes : "+count(root));

   }
}
