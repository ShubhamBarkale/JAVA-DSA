
class Node {

    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}


class myStack {

    Node head;       // Top of stack
    int len = 0;     // Size of stack


    // PUSH
    void push(int ele) {

        Node temp = new Node(ele);

        // If stack is empty
        if (len == 0) {
            head = temp;
        }

        // If stack is not empty
        else {
            temp.next = head;
            head = temp;
        }

        len++;
    }


    // POP
    int pop() {

        // Check if stack is empty
        if (len == 0) {
            System.out.println("Stack is empty");
            return -1;
        }

        // Store top value
        int x = head.val;

        // Move head to next node
        head = head.next;

        // Decrease size
        len--;

        return x;
    }


    // PEEK
    int peek() {

        if (len == 0) {
            System.out.println("Stack is empty");
            return -1;
        }

        return head.val;
    }


    // SIZE
    int size() {

        return len;
    }


    // IS EMPTY
    boolean isEmpty() {

        return len == 0;
    }


    // DISPLAY
    void display() {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.val + " ");

            temp = temp.next;
        }

        System.out.println();
    }
}


public class LLImplementationofStack {

    public static void main(String[] args) {

        myStack st = new myStack();


        // PUSH
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println("Stack:");
        st.display();


        // PEEK
        System.out.println("Top element: " + st.peek());


        // SIZE
        System.out.println("Size: " + st.size());


        // POP
        System.out.println("Popped: " + st.pop());
        System.out.println("Popped: " + st.pop());


        // DISPLAY AFTER POP
        System.out.println("Stack after pop:");
        st.display();


        // PEEK
        System.out.println("Top element: " + st.peek());


        // SIZE
        System.out.println("Size: " + st.size());


        // IS EMPTY
        System.out.println("Is stack empty? " + st.isEmpty());
    }
}

