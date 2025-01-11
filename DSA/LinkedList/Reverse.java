package DSA.LinkedList;

public class Reverse {

    public static class Node{      // creating the single 1st node via Node class
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

    public void addLastToLinkedList(int data){  // to add elements in linked list
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head= tail= newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode ;
    }

    public void printLL(){      // to print all linked list 
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data + "-");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse(){    // for reversing the linked list 
        Node prev = null;
        Node curr = tail = head ;
        Node next ;
        while(curr != null){
            next = curr.next ;
            curr.next = prev ;
            prev = curr;
            curr = next ;
        }
        head = prev ;
    }
    
    public static void main(String[] args) {
        Reverse ll = new Reverse();

        ll.addLastToLinkedList(20);
        ll.addLastToLinkedList(60);
        ll.addLastToLinkedList(45);
        ll.addLastToLinkedList(4);
        ll.addLastToLinkedList(23);
        ll.addLastToLinkedList(63);

        ll.printLL();
        System.out.println("reversing the linked list ...");
        ll.reverse();
        ll.printLL();

    }
}
