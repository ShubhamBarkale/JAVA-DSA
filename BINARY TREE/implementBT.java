class Node{
    int val;
    Node left;
    Node right;

     Node(int val ) {
        this.val=val;
    }
    
}




public class implementBT{


public static void main(String[] args) {
   Node a = new Node(3);
   Node b = new Node(4);
   Node c = new Node(2);
   Node d = new Node(-1);
   Node e = new Node(1);
   Node f = new Node(6);
   Node g = new Node(9);

   a.left=b ; a.right=c;
   b.left=d ; b.right=e;
   c.left=f ; c.right=g;

   display(a);
   System.out.println();
   System.out.println(size(a));
   System.out.println(sum(a));
   System.out.println(prouct(a));
   System.out.println(Maximumval(a));

}
public static void display(Node root){
    if(root==null)return;
     System.out.print((root.val+" "));
     display(root.left);
     display(root.right);
}
public static int size(Node root){
    if(root ==null ) return 0;
    int lesftSize = size(root.left);
    int rightSize =size(root.right);
    return 1+lesftSize+rightSize;
}
public static int sum(Node root){
    if(root ==null ) return 0;
    int LeftSum = sum(root.left);
    int rightSum = sum(root.right);
    return root.val+LeftSum+rightSum;

}
public static int prouct(Node root){
    if(root ==null) return 1;
    int LeftP =prouct(root.left);
    int rightP=prouct(root.right);
    return root.val*LeftP*rightP;
}
public static int Maximumval(Node root){
    if(root ==null) return Integer.MIN_VALUE;
    int leftmax =Maximumval(root.left);
    int rightmax=Maximumval(root.right);
    return Math.max(root.val,Math.max(leftmax,rightmax));


}
}