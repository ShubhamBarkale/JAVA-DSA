public class human implements Cloneable {

    int age;
    String name;
    int[]arr;

    // Normal constructor
    public human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr=new int[]{3,4,5,6,7,8,9};
    }

    // // Copy constructor
    // public human(human other) {
    //     this.age = other.age;
    //     this.name = other.name;
    // }



    // // Clone method
    // @Override
    // public Object clone() throws CloneNotSupportedException {
    //     // this is shallow copy 
    //     return super.clone();
    // }




  // Clone method
@Override
public Object clone() throws CloneNotSupportedException {

    // First, create a shallow copy
    human twin = (human) super.clone();

    // Now create a new array
    // This makes the array independent
    twin.arr = new int[twin.arr.length];

    // Copy each element into the new array
    for (int i = 0; i < twin.arr.length; i++) {
        twin.arr[i] = this.arr[i];
    }

    // Return the deep-copied object
    return twin;
}
    }
