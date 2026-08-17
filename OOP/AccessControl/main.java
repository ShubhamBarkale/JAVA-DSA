public class main {
    public static void main(String[] args) {

        A obj = new A(10, "shubham",);

        // 1. Access the data member
        System.out.println("Number: " + obj.getNum());

        // 2. Modify the data member
        obj.setNum(20);

        // Access the modified value
        System.out.println("Updated Number: " + obj.getNum());

        // Access name
        System.out.println("Name: " + obj.name);
    }
}