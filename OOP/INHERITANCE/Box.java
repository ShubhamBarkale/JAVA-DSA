public class Box {

    double l;
    double h;
    double w;

    // Default constructor
    Box() {

        super(); // object class 

        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // Cube constructor
    Box(double side) {
        this.w = side;
        this.l = side;
        this.h = side;
    }

    // Parameterized constructor
    Box(double h, double l, double w) {
        this.w = w;
        this.l = l;
        this.h = h;
    }

    // Copy constructor
    Box(Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    // Method
    public void information() {
        System.out.println("Running the box");
    }

    public static void main(String[] args) {

        // // Default constructor
        // Box box1 = new Box();

        // // Cube constructor
        // Box box2 = new Box(4);

        // // Parameterized constructor
        // Box box3 = new Box(4.6, 7.7, 8);

        // // Copy constructor
        // Box box4 = new Box(box1);

        // // Print all objects
        // System.out.println("Box1: " + box1.l + " " + box1.h + " " + box1.w);
        // System.out.println("Box2: " + box2.l + " " + box2.h + " " + box2.w);
        // System.out.println("Box3: " + box3.l + " " + box3.h + " " + box3.w);
        // System.out.println("Box4: " + box4.l + " " + box4.h + " " + box4.w);



BoxWeight box3 = new BoxWeight();

System.out.println( box3.h + " " +box3.weight + " " + box3.l);
    }
}