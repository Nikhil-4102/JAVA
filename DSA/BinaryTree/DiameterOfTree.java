package DSA.BinaryTree;

public class DiameterOfTree {
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

   public static int hight(Node root){
    if(root == null){
      return 0;
    }
    int lh = hight(root.left);
    int rh = hight(root.right);
    int h = Math.max(lh , rh)+1 ;
    return h ;
   }

   public static int diameter(Node root ){
    if(root == null) return 0 ;

    int leftdia = diameter(root.left);
    int lefth =  hight(root.left);
    int rightdia = diameter(root.right);
    int righth = hight(root.right);
    int selfDia = lefth + righth + 1 ;

    int dia = Math.max(selfDia , Math.max(leftdia , rightdia));

     return dia ;
   }

    
 
   public static void main(String[] args) {
      int nodes[] = { 1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
      binaryTree tree = new binaryTree();
      Node root = tree.buildTree(nodes);
      System.out.println("Root of tree : "+root.data);

      System.out.println("Diameter of tree : "+diameter(root));


   }
}
