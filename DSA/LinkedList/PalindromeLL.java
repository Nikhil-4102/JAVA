package DSA.LinkedList;

public class PalindromeLL {
    
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

    public Node findMidOfLL(Node head){   // finding mid of linked list using slow fast algorithm
        Node slow = head ;
        Node fast = head ;
        while(fast !=null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        return slow ;
    }

    public boolean CheckPalindrome(){         // checking Linked list is palindrome or not 
        if(head == null || head.next == null) return true;
        Node midNode = findMidOfLL(head); 
        
        Node prev = null;
        Node crr = midNode;
        Node next ;
        while(crr != null){
            next =crr.next ;
            crr.next=prev ;
            prev= crr;
            crr=next; 
        }

        Node left = head;
        Node right = prev;
        while(right != null){
            if(left.data != right.data) return false ;
            left= left.next;
            right = right.next;
        }
        return true ;
        
    }

        public static void main(String[] args) {
         PalindromeLL ll = new PalindromeLL();
        
         ll.addLastToLL(20);
         ll.addLastToLL(65);
         ll.addLastToLL(45);
         ll.addLastToLL(45);
         ll.addLastToLL(65);
         ll.addLastToLL(20);
         
         System.out.println(ll. CheckPalindrome());

    }
}
