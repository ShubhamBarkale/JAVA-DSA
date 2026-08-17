public class Ehandling{
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try {
        //    divide(a,b);
        String name="shubham";
        if(name.equals("shubham")){
            throw new MyException("name is shubham");
        }
        }
        
        // my own exception 
        catch(MyException e){
            System.out.println(e.getMessage());
        } 
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("this will run alwayys  ");
        }
        




    }
    static  int divide (int a,int b)throws ArithmeticException{
        if(b==0){
    throw new  ArithmeticException("please do not devide by 0 ");
        }
        return a/b;
    }
}