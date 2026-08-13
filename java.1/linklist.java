// public class linklist {

//     // Head stores the first node of the linked list
//     Node head;

//     // Node class
//     class Node {

//         // Data part of node
//         String data;

//         // Reference to next node
//         Node next;

//         // Constructor
//         Node(String data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     // Method to add element at beginning
//     public void addFirst(String data) {

//         // Create new node
//         Node newNode = new Node(data);

//         // If list is empty
//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         // New node points to current head
//         newNode.next = head;

//         // New node becomes new head
//         head = newNode;
//     }

//     // Method to add element at end
//     public void addLast(String data) {

//         // Create new node
//         Node newNode = new Node(data);

//         // If list is empty
//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         // Start from head
//         Node currNode = head;

//         // Traverse till last node
//         while (currNode.next != null) {
//             currNode = currNode.next;
//         }

//         // Last node points to new node
//         currNode.next = newNode;
//     }

//     // Method to print linked list
//     public void printList() {

//         // Check if list is empty
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         // Start traversal from head
//         Node currNode = head;

//         // Traverse and print all nodes
//         while (currNode != null) {

//             System.out.print(currNode.data + " -> ");

//             currNode = currNode.next;
//         }

//         // Print NULL at end
//         System.out.println("NULL");
//     }

//     // Main method
//     public static void main(String[] args) {

//         // Create linked list object
//         linklist list = new linklist();

//         // Add elements at beginning
//         list.addFirst("a");
//         list.addFirst("is");

//         // Add element at end
//         list.addLast("list");

//         // Print linked list
//         list.printList();
//     }
// }









































// public class linklist {

//     Node head;

//     // Node class
//     class Node {
//         String data;
//         Node next;

//         Node(String data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     // Add at first
//     public void addFirst(String data) {

//         Node newNode = new Node(data);

//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         newNode.next = head;
//         head = newNode;
//     }

//     // Add at last
//     public void addLast(String data) {

//         Node newNode = new Node(data);

//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         Node currNode = head;

//         while (currNode.next != null) {
//             currNode = currNode.next;
//         }

//         currNode.next = newNode;
//     }

//     // Delete first node
//     public void deleteFirst() {

//         // If list is empty
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         // Move head to next node
//         head = head.next;
//     }

//     // Delete last node
//     public void deleteLast() {

//         // If list is empty
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         // If only one node exists
//         if (head.next == null) {
//             head = null;
//             return;
//         }

//         // Previous node
//         Node secondLast = head;

//         // Last node
//         Node lastNode = head.next;

//         // Traverse till last node
//         while (lastNode.next != null) {
//             lastNode = lastNode.next;
//             secondLast = secondLast.next;
//         }

//         // Remove last node
//         secondLast.next = null;
//     }

//     // Print list
//     public void printList() {

//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         Node currNode = head;

//         while (currNode != null) {
//             System.out.print(currNode.data + " -> ");
//             currNode = currNode.next;
//         }

//         System.out.println("NULL");
//     }

//     public static void main(String[] args) {

//         linklist list = new linklist();

//         list.addFirst("this");
//         list.addLast("is");
//         list.addLast("a");
//         list.addLast("list");

//         System.out.println("Original List:");
//         list.printList();

//         // Delete first node
//         list.deleteFirst();

//         System.out.println("After deleting first:");
//         list.printList();

//         // Delete last node
//         list.deleteLast();

//         System.out.println("After deleting last:");
//         list.printList();
//     }
// }  






















































































// public class linklist {

//     Node head;

//     // Node class
//     class Node {
//         String data;
//         Node next;

//         Node(String data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     // Add at first
//     public void addFirst(String data) {

//         Node newNode = new Node(data);

//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         newNode.next = head;
//         head = newNode;
//     }

//     // Add at last
//     public void addLast(String data) {

//         Node newNode = new Node(data);

//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         Node currNode = head;

//         while (currNode.next != null) {
//             currNode = currNode.next;
//         }

//         currNode.next = newNode;
//     }

//     // Delete first node
//     public void deleteFirst() {

//         // If list is empty
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         // Move head to next node
//         head = head.next;
//     }

//     // Delete last node
//     public void deleteLast() {

//         // If list is empty
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         // If only one node exists
//         if (head.next == null) {
//             head = null;
//             return;
//         }

//         // Previous node
//         Node secondLast = head;

//         // Last node
//         Node lastNode = head.next;

//         // Traverse till last node
//         while (lastNode.next != null) {
//             lastNode = lastNode.next;
//             secondLast = secondLast.next;
//         }

//         // Remove last node
//         secondLast.next = null;
//     }

//     // Print list
//     public void printList() {

//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         Node currNode = head;

//         while (currNode != null) {
//             System.out.print(currNode.data + " -> ");
//             currNode = currNode.next;
//         }

//         System.out.println("NULL");
//     }
//     // Reverse linked list
// public void reverseList() {

//     // If list is empty or has one node
//     if (head == null || head.next == null) {
//         return;
//     }

//     Node prevNode = head;
//     Node currNode = head.next;

//     while (currNode != null) {

//         Node nextNode = currNode.next;

//         // Reverse link
//         currNode.next = prevNode;

//         // Move forward
//         prevNode = currNode;
//         currNode = nextNode;
//     }

//     // Old head becomes last node
//     head.next = null;

//     // New head
//     head = prevNode;
// }

//     public static void main(String[] args) {

//         linklist list = new linklist();

//         list.addFirst("this");
//         list.addLast("is");
//         list.addLast("a");
//         list.addLast("list");

//         System.out.println("Original List:");
//         list.printList();

//         // Delete first node
//         list.deleteFirst();

//         System.out.println("After deleting first:");
//         list.printList();

//         // Delete last node
//         list.deleteLast();

//         System.out.println("After deleting last:");
//         list.printList();
//     }
// }















































public class linklist {

    Node head;

    // Node class
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add at first
    public void addFirst(String data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add at last
    public void addLast(String data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // Delete first node
    public void deleteFirst() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
    }

    // Delete last node
    public void deleteLast() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Only one node
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    // Recursive reverse method
    public Node reverseRecursive(Node head) {

        // Base condition
        if (head == null || head.next == null) {
            return head;
        }

        // Reverse remaining list
        Node newHead = reverseRecursive(head.next);

        // Reverse links
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    // Print list
    public void printList() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }

    // Main method
    public static void main(String[] args) {

        linklist list = new linklist();

        // Adding elements
        list.addFirst("this");
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");

        System.out.println("Original List:");
        list.printList();

        // Reverse recursively
        list.head = list.reverseRecursive(list.head);

        System.out.println("Reversed List:");
        list.printList();

        // Delete first node
        list.deleteFirst();

        System.out.println("After deleting first:");
        list.printList();

        // Delete last node
        list.deleteLast();

        System.out.println("After deleting last:");
        list.printList();
    }
}