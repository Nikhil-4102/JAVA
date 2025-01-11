package DSA.LinkedList;

public class LL_search {

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

    public int search(int key){      // search key in linked list 
       
        Node temp = head ;
        int i = 0 ;
        while(temp != null){
            if(temp.data==key){
                return i ;
            }
            temp = temp.next ;
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
         LL_search ll =new LL_search();
        
         ll.addLastToLL(20);
         ll.addLastToLL(60);
         ll.addLastToLL(45);
         ll.addLastToLL(4);
         ll.addLastToLL(23);
         ll.addLastToLL(63);
         
        System.out.println( ll.search(23) );
        System.out.println( ll.search(55) );

    }
}
