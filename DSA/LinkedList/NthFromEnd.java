package DSA.LinkedList;

public class NthFromEnd {
    public class Node{
        int data;
        Node next ;
        public Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    public static Node head ; 
    public static Node tail ;

    public void addLastInLL(int data){      // add value to last of the linked list 
        Node newNode = new Node(data);
        if(head==null){
            head= tail= newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode ;
    }


    public void print(){      // to print all linked list 
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data + "-");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteNthNodeFromEnd(int n){
           int size = 0 ;
            Node temp = head ;
            while(temp != null){
                temp = temp.next ;
                size++;
            }

            if(n==size){
                head= head.next;
                return ;
            }

            int i = 1 ; 
            Node prev = head ;
            while(i<(size-n)){
                 prev = prev.next;
                 i++;
            }
            prev.next= prev.next.next;
            return ;
    }


    public static void main(String[] args) {
        NthFromEnd ll = new NthFromEnd();
        ll.addLastInLL(1);
        ll.addLastInLL(2);
        ll.addLastInLL(3);
        ll.addLastInLL(4);
        ll.addLastInLL(5);
        ll.addLastInLL(6);
        ll.print();
        System.out.println("Deleting "+3+"rd node form end ...");
        ll.deleteNthNodeFromEnd(3);
        ll.print();
    }
}
