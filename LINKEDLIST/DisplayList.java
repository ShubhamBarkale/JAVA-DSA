class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class DisplayList {

    // Head points to first node
    Node head;

    // Tail points to last node
    Node tail;

    // Stores number of nodes
    int size;


    // ==============================
    // Display using recursion
    // ==============================
    public static void displayRec(Node head) {

        if (head == null)
            return;

        System.out.print(head.val + " ");

        displayRec(head.next);
    }


    // ==============================
    // Display using loop
    // ==============================
    public static void displayLoop(Node head) {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.val + " ");

            temp = temp.next;
        }

        System.out.println();
    }


    // ==============================
    // Add at Head
    // ==============================
    void addAtHead(int val) {

        Node temp = new Node(val);

        if (head == null) {

            head = tail = temp;
        }
        else {

            temp.next = head;
            head = temp;
        }

        size++;
    }


    // ==============================
    // Add at Tail
    // ==============================
    void addTail(int val) {

        if (tail == null) {

            addAtHead(val);
            return;
        }

        Node temp = new Node(val);

        tail.next = temp;

        tail = temp;

        size++;
    }


    // ==============================
    // Delete at Head
    // ==============================
    void deleteAtHead() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;
    }


void insert(int val, int idx) {

    // Check invalid index
    if (idx < 0 || idx > size) {
        System.out.println("Invalid index");
        return;
    }

    // Insert at beginning
    if (idx == 0) {
        addAtHead(val);
    }

    // Insert at end
    else if (idx == size) {
        addTail(val);
    }

    // Insert in the middle
    else {

        Node temp = head;

        // Reach the node just before idx
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }

        // Create new node
        Node t = new Node(val);

        // Connect new node to next node
        t.next = temp.next;

        // Connect previous node to new node
        temp.next = t;

        // Increase size
        size++;
    }
}
    // ==============================
    // Search
    // ==============================
    boolean search(int val) {

        if (head == null)
            return false;

        Node temp = head;

        while (temp != null) {

            if (temp.val == val)
                return true;

            temp = temp.next;
        }

        return false;
    }


    // ==============================
    // Get value at index
    // ==============================
    private static int get(Node head, int idx) {

        for (int i = 1; i <= idx; i++) {

            head = head.next;
        }

        return head.val;
    }


    // ==============================
    // Main
    // ==============================
    public static void main(String[] args) {

        // Create linked list object
        DisplayList ll = new DisplayList();


        // Add nodes
        ll.addAtHead(10);
        ll.addAtHead(20);
        ll.addAtHead(30);

        // List:
        // 30 → 20 → 10


        // Add at tail
        ll.addTail(40);

        // List:
        // 30 → 20 → 10 → 40


        // Display
        displayLoop(ll.head);


        // Delete first node
        ll.deleteAtHead();

        // List:
        // 20 → 10 → 40
        ll.insert(40,2);


        // Display again
        displayLoop(ll.head);


        // Search
        System.out.println(ll.search(10));   // true
        System.out.println(ll.search(50));   // false


        // Get index 2
        System.out.println(get(ll.head, 2)); // 40
    }
}