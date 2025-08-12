package DSA.LinkedList;

public class RemoveLoop {
    
     public static class Node{
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

  public static void printLL(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    System.out.println("null");
  }

    public static void removeLoop(Node head) {

        if (head == null || head.next == null) return;

        Node slow = head;
        Node fast = head;

        // Detect loop using Floyd's Cycle-Finding Algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // Loop detected
                break;
            }
        }

        if (slow != fast) return; // No loop

        // Find the start of the loop
        slow = head;
        Node loopNode = null;
        while (slow != fast) {
            loopNode = fast; // Keep track of the last node before the loop
            slow = slow.next;
            fast = fast.next;
        }
        loopNode.next = null; // Remove the loop by setting the last node's next to null
        
    }
    public static void main(String[] args) {
    head = new Node(1);
    Node second = new Node(2);
    head.next = second;
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = second; // Creating a loop for testing   
    
    removeLoop(head);
    printLL(); // Should print the list without the loop
    
  }

}
