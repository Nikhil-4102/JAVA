package DSA.LinkedList;


public class LinkedList {

   public static class Node {
      int data ; 
      Node next ;
      Node(int data){
         this.data = data ;
         this.next = null ;
      }
   }
   public static Node head;
   public static Node tail;

   public void addFirst(int data){  //............................................add first
      Node newNode = new Node(data);
      if(head == null){
         head= tail = newNode;
         return ;
      }
      newNode.next = head ;
      head = newNode;
   }  

   public void addLast(int data){   // ............................................add last
      Node newNode = new Node(data);
      if(head == null){
         head= tail = newNode;
         return ;
      }
      tail.next = newNode;
      tail = newNode;
   }

   public void printLL(){   //............................................print linked list
       Node temp = head;
       while(temp != null){
         System.out.print(temp.data + " -> ");
         temp = temp.next;;
       }
       System.out.println("null");
   }

   public void addMiddle(int data , int index){     //............................................add middle
        Node newNode =  new Node(data);
         if(head == null){
               head = tail = newNode;
               return ;
         }
         Node temp = head;
         for(int i = 0 ; i < index - 1 ; i++){
            temp = temp.next;
         }
         newNode.next = temp.next ;
         temp.next = newNode;
         if(newNode.next == null){ // if new node is added at the end   
            tail = newNode;
         }    
   }

   public int size(){            //............................................size of linked list
      Node temp = head;
      int size  = 0 ;
      while (temp != null){
         temp = temp.next;
         size++;
      }
       return size;
   }


   public int deleteFirst(){     //............................................delete first
      if(head == null){
         System.out.println("LinkedList is empty");
         return -1;
      }
      if(head == tail){
         head = tail = null ;
         return head.data;
      }
      int val = head.data;
      head = head.next ;
      return val;
   }

   public int deleteLast(){     //............................................delete last
      if(head == null){
         System.out.println("LinkedList is empty");
         return -1;
      }
      if(head == tail){
         int val = head.data;
         head = tail = null ;
         return val;
      }
      Node prev = head;
      for(int i = 0 ; i<size()-2 ; i++){
         prev = prev.next;
      }
      int val = tail.data;
      prev.next = null;
      tail = prev;
      return val;      
   }

   public int deleteMiddle(int index){        //............................................delete middle

      if(index < 0 || index >= size()){
         System.out.println("Invalid index");
         return -1;
      }

      if(head==null){
         System.out.println("LinkedList is empty");
         return -1;
      }
      if(head == tail){
         int val = head.data;
         head = tail = null ;
         return val;
      }
      Node temp = head ;
      if(index == 0){
         return deleteFirst();
      }
      if(index == size() - 1){
         return deleteLast();
      }
      for(int i = 0 ; i < index-1 ; i++){
         temp = temp.next;
      }
      int val = temp.next.data;
      temp.next = temp.next.next;
      return val;

   }

   public int search(int key){      //............................................search (itterative)
      Node temp = head;
      int i = 0 ;
      while(temp != null){
         if(temp.data == key){
            return i;
         }
         temp = temp.next;
         i++;
      }
      return -1;
   }

   public int serach2(int key){     //............................................search (recursive)
      return helper(head,key);
   }
   private int helper(Node head ,int key){
      if(head ==  null){
         return -1;
      }
      if(head.data == key){
         return 0;
      }
      int index = helper(head.next, key);
      if(index == -1){
         return -1;
      }  
      return index + 1; // increment index by 1 for each recursive call
   }

   public void reverse(){                    //............................................reverse linked list
      
      Node prev= null;
      Node crr = head;
      tail = head ;
      Node next ;
      while(crr != null){
         next = crr.next ;
         crr.next = prev ;
         prev = crr ;
         crr = next ;
      }
      head = prev ;
      return ;
   }

   public static void main(String[] args) {

      LinkedList list = new LinkedList();
      list.addFirst(10);
      list.addFirst(20);
      list.addFirst(30);
      list.addLast(40);
      list.addLast(50);
      list.addMiddle(25, 2);
      list.addMiddle(35, 4);

      list.printLL();
      list.size();

      list.deleteFirst();
      list.deleteLast();

      list.printLL();
      list.size();

      System.out.println(  list.search(35));
      System.out.println(list.search(100));
      System.out.println(".............................................");
      System.out.println(  list.serach2(35));
      System.out.println(list.serach2(100));

      list.deleteMiddle(2);
      list.printLL();

      list.reverse();
      list.printLL();
    
   }

}
