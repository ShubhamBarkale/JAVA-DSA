public class Fibonacci2{
    public static void main(String[] args) {
    //    int ans = fibo(6);
       System.out.print(fibo(6));
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}

//check for high values like 50 60 it will not run because of stack overflow error. It will take a lot of time to compute the value of fibo(50) or fibo(60) because it is using recursion and it is not optimized.