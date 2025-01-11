package DSA.LinkedList;


public class LinkedList {
    
    public static class Node{    // to create 1st single node we have to create Node class  
        int data ;
        Node next ;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;    // declearing head as a static bcoz it can be referable to whole class
    public static Node tail;
    public static int size ;    // declearing tail 



    public void addfirst(int data){    // add value to first of linked list 
        Node newNode = new Node(data);
        size++;
        if(head==null){
           head = tail = newNode ;
           return ;
        }
        newNode.next = head ;
        head  = newNode ;
    }
    


    public void addlast(int data){      // add value to last of the linked list 
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head= tail= newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode ;
    }



    public void add(int index , int data){    // add value  at given index 

        if (index==0 ){
            addfirst(data);
            return ;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head ;
        int i = 0 ; 
        while(i < index-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next ;
        temp.next = newNode ;
    }



    public int removeFirst(){             //   remove first element from linked list  
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if (size ==1){
            int val = head.data ;
            head= tail = null;
            size = 0 ;
            return val ;
        }
        int val = head.data;
        head = head.next ;
        size--;
        return val ;
    }



    public int removeLast(){       //  remove last node from LL  
        if(size==0){
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
        }else if( size==1){
         int val = head.data;
         head = tail = null;
         size = 0 ;
         return val; 
        }
        Node prev = head;
        for(int i = 0 ; i< size-2 ; i++){
            prev = prev.next ;
        }
        int val = prev.next.data ;
        prev.next=null;
        tail = prev;
        size--;
        return val ;
    }



    public void printLL(){      // to print all linked list 
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data + "-");
            temp = temp.next;
        }
        System.out.println("null");
    }


    
    public static void main(String args[]){  // main function 
         LinkedList ll = new LinkedList();
         ll.printLL();
         
         ll.addfirst(2);
         ll.printLL();

         ll.addfirst(1);
         ll.printLL();

         ll.addlast(3);
         ll.printLL(); 
         
         ll.addlast(4);
         ll.printLL(); 
         
         ll.add(2, 5);
         ll.printLL();

        System.out.println("Length of LL : "+ll.size);

        ll.removeFirst();
        ll.printLL();

        ll.removeLast();
        ll.printLL();

        System.out.println("Length of LL : "+ll.size);
    }
}
