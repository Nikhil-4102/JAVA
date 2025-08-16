package DSA.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

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
    public static class levelOrder{
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

    public static void levelOrderTraversal(Node root){
            if(root == null) return ;
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode = q.remove(); 
                if(currNode == null){
                    System.out.println();
                    
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }

        }
    
    
    
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        levelOrder tree = new levelOrder();
        Node root = tree.buildtree(nodes);
        System.out.println("root of tree : "+root.data);
        System.out.println("levelOrder traversal : ");
        levelOrderTraversal(root);
     }
}
