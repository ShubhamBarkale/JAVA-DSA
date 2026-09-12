// Node class represents one node of the Linked List
class Node {

    int val;       // Stores the value/data of the node
    Node next;     // Stores the reference/address of the next node
   Node(int val){
    this.val=val;
   }

}

// Main class
public class NodesOfLinkdlist {
public static void main(String[] args) {
  // Create the first node
        Node a = new Node(10);
// Create the second node
        Node b = new Node(20);    
 // Create the third node
        Node c = new Node(30); 
// Create the fourth node
        Node d = new Node(40);
     
 // Create the fifth node
        Node e = new Node(50);

// Connect node 'a' to node 'b'
        // a -> b
        a.next = b;
 // Connect node 'b' to node 'c'
        // a -> b -> c
        b.next = c;
// Connect node 'c' to node 'd'
        // a -> b -> c -> d
        c.next = d;
 // Connect node 'd' to node 'e'
        // a -> b -> c -> d -> e
        d.next = e;
     System.out.println(a);
      System.out.println(b);
    System.out.println(a.next);
    }
}