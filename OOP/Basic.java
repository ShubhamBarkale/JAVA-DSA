// Student     → Class
// new Student() → Object creation
// s1          → Reference variable



// Primitive variable
//         ↓
// stores actual value

// Reference variable
//         ↓
// stores reference to an object



// class Student {

//     int rollNo;
//     String name;

//     // Constructor
//     Student(int rollNo, String name) {
//         this.rollNo = rollNo;
//         this.name = name;
//     }

//     // Method
//     void display() {
//         System.out.println("Roll No: " + rollNo);
//         System.out.println("Name: " + name);
//     }
// }

// public class Basic {
//     public static void main(String[] args) {

//         // Objects
//         Student s1 = new Student(101, "Shubham");
//         Student s2 = new Student(102, "Rahul");

//         s1.display();
//         s2.display();
//     }
// }























// connected to main file 

public class Basic {

    int age;
    String name;
    int salary;
    boolean married;
    static long population;  // ark why static ?

    public Basic(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Basic.population +=1;  // why ? // and why Basic not this.
    }
}