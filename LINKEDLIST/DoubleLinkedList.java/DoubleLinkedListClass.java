public class DoubleLinkedListClass {

    // Node of Doubly Linked List
    class ListNode {
        int val;           // Stores data
        ListNode next;     // Points to next node
        ListNode prev;     // Points to previous node

        // Constructor
        ListNode(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    // Doubly Linked List class
    class DLL {
        ListNode head;     // Points to first node
        ListNode tail;     // Points to last node
        int size;          // Stores number of nodes

        // Insert a node at the beginning
        void insertAtHead(int val) {
            ListNode temp = new ListNode(val);

            // If list is empty
            if (head == null) {
                head = tail = temp;
            } 
            else {
                temp.next = head;
                head.prev = temp;
                head = temp;
            }

            size++;
        }

        // Insert a node at the end
        void insertAtTail(int val) {
            ListNode temp = new ListNode(val);

            // If list is empty
            if (head == null) {
                head = tail = temp;
            } 
            else {
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
            }

            size++;
        }

        // Insert node at a given index
        void insert(int idx, int val) {

            // If index is 0, insert at head
            if (idx == 0) {
                insertAtHead(val);
                return;
            }

            // If index is equal to size, insert at tail
            if (idx == size) {
                insertAtTail(val);
                return;
            }

            // Create new node
            ListNode a = new ListNode(val);

            // Move temp to the node before the required index
            ListNode temp = head;

            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }

            // Store the next node
            ListNode b = temp.next;

            // Connect previous node to new node
            temp.next = a;

            // Connect new node to previous node
            a.prev = temp;

            // Connect new node to next node
            a.next = b;

            // Connect next node back to new node
            b.prev = a;

            // Increase size
            size++;
        }

        // Delete node from the beginning
        void deleteAtHead() {

            // If list is empty
            if (size == 0) {
                System.out.println("List is empty");
                return;
            }

            // If there is only one node
            if (size == 1) {
                head = tail = null;
            } 
            else {
                // Move head to next node
                head = head.next;

                // Remove previous connection
                head.prev = null;
            }

            size--;
        }

        // Delete node from the end
        void deleteAtTail() {

            // If list is empty
            if (size == 0) {
                System.out.println("List is empty");
                return;
            }

            // If there is only one node
            if (size == 1) {
                head = tail = null;
            } 
            else {
                // Move tail to previous node
                tail = tail.prev;

                // Remove next connection
                tail.next = null;
            }

            size--;
        }

        // Display list from head to tail
        void display() {
            ListNode temp = head;

            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }

            System.out.println();
        }

        // Display list from tail to head
        void displayReverse() {
            ListNode temp = tail;

            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.prev;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Create outer class object
        DoubleLinkedListClass obj = new DoubleLinkedListClass();

        // Create Doubly Linked List object
        DLL list = obj.new DLL();

        // Insert elements at head
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.insertAtHead(50);

        // Display list
        list.display();

        // Display reverse
        list.displayReverse();

        // Insert 25 at index 2
        list.insert(2, 25);

        // Display after insertion
        list.display();
        list.displayReverse();

        // Delete from head
        list.deleteAtHead();

        // Delete from tail
        list.deleteAtTail();

        // Display after deletion
        list.display();
        list.displayReverse();
    }
}