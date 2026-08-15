// Pen is a class
// It is a blueprint for creating Pen objects.
class Pen {

    // Properties / data members of Pen
    String color;
    String type;


    // Method
    // This method performs an action.
    public void Write() {
        System.out.println("writing something");
    }


    // Method
    // 'this.color' means the color of the current Pen object.
    public void printolor() {
        System.out.println(this.color);
    }
}


// Student is a class
class Student {

    // Properties / data members
    String name;
    int age;


    // Method
    // This method prints the student's information.
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }


    // // Parameterized Constructor
    // // It receives name and age when the object is created.
    // Student(String name, int age) {

    //     // 'this.name' = Student class's name variable
    //     // 'name' = constructor's parameter
    //     this.name = name;

    //     // 'this.age' = Student class's age variable
    //     // 'age' = constructor's parameter
    //     this.age = age;

    //     System.out.println("constructor called");
    // }
        


        Student(){

        }



 // Copy constructor
    // It takes another Student object as a parameter.
    Student(Student s2) {

        // Copy name from s2 object to current object
        this.name = s2.name;

        // Copy age from s2 object to current object
        this.age = s2.age;
    }


    // Method Overloading
    // Same method name, but different parameters.

    public void printInfo(String name) {
        System.out.println(name);
    }


    public void printInfo(int age) {
        System.out.println(age);
    }


    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}


// Main class
public class OOPS {

    // Program execution starts from main()
    public static void main(String[] args) {

        // // Creating a Student object
        // //
        // // "Student" -> type/class
        // // "s1"      -> reference variable
        // // "new"     -> creates a new object
        // // "Student("shubham", 21)" -> calls the constructor
        // //
        // // "shubham" goes into the 'name' parameter
        // // 21 goes into the 'age' parameter
        // Student s1 = new Student("shubham", 21);


        // // Calling the printInfo() method
        // // It prints the values stored in s1.
        // s1.printInfo();



         Student s1 =new Student();
         s1.name="shubham";
         s1.age=21;


         // method over loding 
         s1.printInfo(s1.name, s1.age);


        //  Student s2 =new Student(s1);
        //  s2.printInfo();
 


    }
}