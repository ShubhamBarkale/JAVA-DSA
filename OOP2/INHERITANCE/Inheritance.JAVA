
// public class Inheritance{

//  public static void main(String args[]){
//      Triangle t1=new Triangle();

//      t1.color ="red";
//  }

// }


// // Parent class
// class Shape {

//     // Property of Shape
//     String color;
// }


// // Child class
// // Triangle inherits the properties of Shape
// class Triangle extends Shape {

// }


// // Main class
// public class Inheritance {

//     public static void main(String args[]) {

//         // Creating an object of Triangle
//         Triangle t1 = new Triangle();

//         // color belongs to Shape,
//         // but Triangle inherited it from Shape.
//         t1.color = "red";

//         System.out.println(t1.color);
//     }
// }








// // // Single-level inheritance
// //
// // Shape = Parent class
// // Triangle = Child class
// //
// // Triangle inherits the methods/properties of Shape.

// class Shape {

//     // Method of parent class
//     public void area() {
//         System.out.println("Display area");
//     }
// }


// // Triangle inherits Shape
// class Triangle extends Shape {

//     // This is a method with parameters.
//     // It calculates the area of a triangle.
//     public void area(int l, int h) {

//         System.out.println(0.5 * l * h);
//     }
// }


// // Main class
// public class Inheritance {

//     public static void main(String[] args) {

//         // Creating Triangle object
//         Triangle t1 = new Triangle();

//         // Calling area() from Shape
//         // Triangle inherited this method from Shape.
//         t1.area();

//         // Calling area(int l, int h) from Triangle
//         t1.area(10, 5);
//     }
// }












// // MULTILEVEL INHERITANCE
// //
// // Shape → Triangle → EquilateralTriangle
// //
// // EquilateralTriangle inherits from Triangle,
// // and Triangle inherits from Shape.


// class Shape {

//     // Method of Shape class
//     public void area() {
//         System.out.println("Display area");
//     }
// }


// // Triangle is a child of Shape
// class Triangle extends Shape {

//     // Method of Triangle
//     public void area(int l, int h) {

//         // 0.5 is used because 1/2 gives 0 in integer division
//         System.out.println(0.5 * l * h);
//     }
// }


// // EquilateralTriangle is a child of Triangle
// class EquilateralTriangle extends Triangle {

//     // Method of EquilateralTriangle
//     public void area(int l, int h) {

//         System.out.println(0.5 * l * h);
//     }
// }


// // Main class
// public class Inheritance {

//     public static void main(String[] args) {

//         // Creating an object of EquilateralTriangle
//         EquilateralTriangle et = new EquilateralTriangle();

//         // EquilateralTriangle can access area()
//         // inherited from Shape.
//         et.area();

//         // Calls area(int l, int h)
//         // from EquilateralTriangle.
//         et.area(10, 5);
//     }
// }













// // HIERARCHICAL INHERITANCE
// //
// // One parent class
// //      ↓
// //    Shape
// //    /   \
// //   ↓     ↓
// // Triangle Circle
// //
// // Triangle and Circle both inherit from Shape.


// // Parent class
// class Shape {

//     // Method of parent class
//     public void area() {
//         System.out.println("Display area");
//     }
// }


// // First child class
// // Triangle inherits from Shape
// class Triangle extends Shape {

//     // Method for calculating triangle area
//     public void area(int l, int h) {

//         // 0.5 is used instead of 1/2
//         // because 1/2 gives 0 in integer division.
//         System.out.println(0.5 * l * h);
//     }
// }


// // Second child class
// // Circle also inherits from Shape
// class Circle extends Shape {

//     // Method for calculating circle area
//     public void area(int r) {

//         System.out.println(3.14 * r * r);
//     }
// }


// // Main class
// public class Inheritance {

//     public static void main(String[] args) {

//         // Creating Triangle object
//         Triangle t1 = new Triangle();

//         // Triangle can use area() from Shape
//         t1.area();

//         // Calls Triangle's area(int l, int h)
//         t1.area(10, 5);


//         // Creating Circle object
//         Circle c1 = new Circle();

//         // Circle can use area() from Shape
//         c1.area();

//         // Calls Circle's area(int r)
//         c1.area(5);
//     }
// }







 class Shape {
    public void area() {
        System.out.println("Display area");
    }
}


class Triangle extends Shape {


    public void area(int l, int h) {


        System.out.println(0.5 * l * h);
    }
}


class Circle extends Shape {

    public void area(int r) {

        System.out.println(3.14 * r * r);
    }
}


// Main class
public class Inheritance {

    public static void main(String[] args) {


        Triangle t1 = new Triangle();


        t1.area();

        t1.area(10, 5);


        Circle c1 = new Circle();

        c1.area();

        c1.area(5);
    }
}



public class inheritance {
    public static void main(String args[]){
        bank.Account account1 =new bank.Account();
    }
}
