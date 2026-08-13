import java.util.*;

// Node class
class Node {
    char ch;
    int freq;
    Node left, right;

    Node(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
        left = right = null;
    }
}

// Comparator
class MyComparator implements Comparator<Node> {
    public int compare(Node x, Node y) {
        return x.freq - y.freq;
    }
}

public class prac2 {

    public static void printCode(Node root, String s) {
        if (root.left == null && root.right == null) {
            System.out.println(root.ch + ": " + s);
            return;
        }
        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }

    public static void main(String[] args) {

        char[] charArray = { 'A', 'B', 'C', 'D', 'E', 'F' };
        int[] charFreq = { 5, 9, 12, 13, 16, 45 };

        PriorityQueue<Node> q = new PriorityQueue<>(new MyComparator());

        for (int i = 0; i < charArray.length; i++) {
            q.add(new Node(charArray[i], charFreq[i]));
        }

        Node root = null;

        while (q.size() > 1) {
            Node x = q.poll();
            Node y = q.poll();

            Node newNode = new Node('-', x.freq + y.freq);
            newNode.left = x;
            newNode.right = y;

            root = newNode;
            q.add(newNode);
        }

        System.out.println("Huffman Codes:");
        printCode(root, "");
    }
}