package DSA.LinkedList;

public class MidOfLL {
    
    public static class Node{
        int data ; 
        Node next ; 
        public Node(int data){
          this.data = data;
          this.next = null;
        }
    } 

    public static Node head ; 
    public static Node tail ;
    public static int size ;

    public void addLastToLL(int data){      // add value to last of the linked list 
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head= tail= newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode ;
    }

    public int findMid(Node head){   // finding mid of linked list using slow fast algorithm
        Node slow = head ;
        Node fast = head ;
        while(fast !=null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        return slow.data ;
    }

        public static void main(String[] args) {
         MidOfLL ll = new MidOfLL();
        
         ll.addLastToLL(20);
         ll.addLastToLL(60);
         ll.addLastToLL(45);
         ll.addLastToLL(4);
         ll.addLastToLL(23);
         ll.addLastToLL(63);
         
        System.out.println(ll.findMid(head));

    }
}
