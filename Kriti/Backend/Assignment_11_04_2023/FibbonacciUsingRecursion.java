package Assignment_11_04_2023;

public class FibbonacciUsingRecursion {
    
    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    public static int fib(int num){
        if(num<1){
            return 1;
        }
        return fib(num-1) + fib(num-2);
    }
}
