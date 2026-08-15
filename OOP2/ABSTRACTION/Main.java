// // ABSTRACT CLASS
// //
// // An abstract class is a class that is incomplete.
// // It is used as a blueprint for child classes.
// //
// // We cannot create an object directly from an abstract class.

// abstract class Animal {

//     // Abstract method
//     // It has NO body.
//     // Child classes MUST provide the implementation.
//     abstract void walk();

//     public Animal() {
//         System.out.println("you are creating a animal");
//     }
    

//     public void eats(){
//         System.out.println("Animal eats ");
//     }
// }


// // Horse is a child class of Animal
// class Horse extends Animal {
//     Horse(){
// System.out.println("created a Hourse");
//     }

//     // Horse provides the implementation of walk()
//     public void walk() {
//         System.out.println("Walks on 4 legs");
//     }
// }


// // Chicken is another child class of Animal
// class Chicken extends Animal {

//     // Chicken provides its own implementation of walk()
//     public void walk() {
//         System.out.println("Walks on 2 legs");
//     }
// }


// // Main class
// public class Main {

//     public static void main(String[] args) {

//         // Creating Horse object
//         Horse horse = new Horse();

//         // Calling Horse's walk() method
//         horse.walk();
//         horse.eats();  // inherited from Animal


//         // Creating Chicken object
//         Chicken chicken = new Chicken();

//         // Calling Chicken's walk() method
//         chicken.walk();


//         // ❌ NOT ALLOWED:
//         // Animal animal = new Animal();
//         //
//         // Animal is an abstract class,
//         // so we cannot create its object directly.
//     }
// }




// // what is construter chaining 


















// INTERFACE

// An interface is like a contract.
// It tells the class what methods it must provide.

interface Animal {

    // Variables inside an interface are automatically:
    // public + static + final
    int eyes = 2;

    // Abstract method
    // The implementing class must provide the body.
    void walk();
}


// Another interface
interface Herbivor {

}


// Horse implements Animal
// "implements" is used when a class uses an interface.
class Horse implements Animal {

    // Providing the implementation of walk()
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}


// Main class
public class Main {

    public static void main(String[] args) {

        // Creating Horse object
        Horse horse = new Horse();

        // Calling walk()
        horse.walk();

        // eyes is static, so it belongs to the Animal interface.
        System.out.println(Animal.eyes);
    }
}

















// ======================= STATIC =======================

// static means the variable or method belongs to the CLASS,
// not to individual objects.

// Example:
// static String college = "SITRC";
//
// We can access it directly using the class name:
// Student.college;
//
// We do NOT need to create an object to access a static member.

// All objects share the same static variable.


// Why is main() static?
//
// public static void main(String[] args)
//
// Java needs to call main() to start the program.
// Since main() is static, Java can call it directly
// without creating an object of the class.
//
// Example:
// Main.main();


// ================= MULTIPLE INHERITANCE =================

// Java does NOT support multiple inheritance using classes.
//
// Example:
//
// class A {
//     void show() {
//         System.out.println("A");
//     }
// }
//
// class B {
//     void show() {
//         System.out.println("B");
//     }
// }
//
// class C extends A, B {   // ❌ NOT ALLOWED
// }
//
// The problem is ambiguity.
//
// Both A and B have the same method:
// show()
//
// If C inherits both, Java would not know which method to call:
//
// C obj = new C();
// obj.show();
//
// Should it call:
// A.show()
// OR
// B.show()
//
// Therefore, Java does not allow a class to extend
// multiple classes.


// ================= MULTIPLE INHERITANCE USING INTERFACES =================

// Java allows a class to implement multiple interfaces.
//
// Example:
//
// interface A {
//     void showA();
// }
//
// interface B {
//     void showB();
// }
//
// class C implements A, B {
//
//     public void showA() {
//         System.out.println("A");
//     }
//
//     public void showB() {
//         System.out.println("B");
//     }
// }
//
// Here C implements both A and B.
//
// This is allowed because C provides the implementation
// of both methods.
//
// Therefore:
//
// class C extends A, B       // ❌ Multiple classes NOT allowed
//
// class C implements A, B    // ✅ Multiple interfaces allowed


// ================= IMPORTANT =================

// extends    → used for class inheritance
// implements → used when a class implements an interface
//
// Example:
//
// class Dog extends Animal
//
// class Horse implements Animal
//
// Multiple classes:
// class C extends A, B        // ❌
//
// Multiple interfaces:
// class C implements A, B     // ✅