package DSA.LinkedList;

public class PalindromeLL {
    
  public class Node{
    int data ;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
  }
  public static Node head;
  public static Node tail;

  public void addLast(int data){
    Node newNode = new Node(data);
    if(head == null){
        head = tail = newNode;
    }
    tail.next = newNode;
    tail = newNode;
  }  

  public void printLL(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    System.out.println("null");
  }

  public static Node midNode(Node head){
    if(head == null) return null;
    Node slow = head;
    Node fast = head;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow; // mid node
  }

  public static boolean isPalindrome(){
    if(head == null || head.next == null) return true;

    Node mid = midNode(head);
    Node prev = null;
    Node curr = mid;
    Node next;

    // Reverse the second half of the linked list
    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    Node firstHalf = head;
    Node secondHalf = prev;

    // Compare both halves
    while(secondHalf != null){
        if(firstHalf.data != secondHalf.data) return false;
        firstHalf = firstHalf.next;
        secondHalf = secondHalf.next;
    }
    
    return true;
  }
    

  public static void main(String[] args) {
    PalindromeLL ll = new PalindromeLL();
    ll.addLast(1);  
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(2);
    ll.addLast(1);

    ll.printLL();
    System.out.println(isPalindrome());
    
  }
}