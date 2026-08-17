import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{

        human shubham = new human(21, "shubham barkale");

        // Copy constructor
        // human twin = new human(shunham);

        // System.out.println(twin.age);
        // System.out.println(twin.name);

  
          human twin =(human)shubham.clone();
           System.out.println(twin.age+" "+twin.name);
           System.out.println(Arrays.toString(twin.arr));
        
           twin.arr[0]=100;
           System.out.println(Arrays.toString(shubham.arr));
           System.out.println(Arrays.toString(twin.arr));
          



        
    }
}