class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class DisplayList {

    // Using recursion
    public static void displayRec(Node head) {

        // Base condition
        if (head == null)
            return;

        // Print current node
        System.out.print(head.val + " ");

        // Go to next node using recursion
        displayRec(head.next);
    }


    // Using loop
    public static void displayLoop(Node head) {

        // Start from first node
        Node temp = head;

        while (temp != null) {

            // Print current node
            System.out.print(temp.val + " ");

            // Move to next node
            temp = temp.next;
        }

        System.out.println();
    }


    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);

        // Connecting nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        // Using recursion
        displayRec(a);

        System.out.println();

        // Using  loop 
        displayLoop(a);
        System.out.print(get(a,2));
    }
   private static int get(Node head, int idx) {
    for (int i = 1; i <=idx; i++) {
        head =head.next;
    }
    return head.val;
}
}