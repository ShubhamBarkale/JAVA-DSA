// import java.util.ArrayList;

// class listArray {
//     public static void main(String[] args) {

//         // Creating an ArrayList that stores Integer values
//         ArrayList<Integer> list = new ArrayList<Integer>();

//         // Creating an ArrayList that stores String values
//         ArrayList<String> list2 = new ArrayList<String>();

//         // Creating an ArrayList that stores Boolean values
//         ArrayList<Boolean> list3 = new ArrayList<Boolean>();


//         // Adding elements to Integer ArrayList
//         list.add(10);
//         list.add(20);
//         list.add(30);

//         // Adding elements to String ArrayList
//         list2.add("Shubham");
//         list2.add("Java");

//         // Adding elements to Boolean ArrayList
//         list3.add(true);
//         list3.add(false);

//         // Printing all ArrayLists
//         System.out.println("Integer List : " + list);
//         System.out.println("String List  : " + list2);
//         System.out.println("Boolean List : " + list3);
//     }
// }













import java.util.ArrayList;
import java.util.Collections;
class listArray{
    public static void main(String[] args) {
    
        ArrayList<Integer> list =new ArrayList<Integer>();
         list.add(0);
         list.add(2);
         list.add(5);

         System.out.println(list);



         int ele=list.get(1);
         System.out.println(ele);

         list.add(1,3);
         System.out.println(list);




         list.set(0,8);
         System.out.println(list);



         list.remove(2);
         System.out.println(list);


         int size=list.size();
          System.out.println(size);


          for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
              
          }
          System.out.println();






          //sorting
          Collections.sort(list);
          System.out.println(list);




    }
}