package Main;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(fibonacciMat(10));
        System.out.println(fibonacciRecursion(10));
    }

    public static int fibonacciMat(int n) {
        int a = 0, b = 1, c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    public static int fibonacciRecursion(int n) {
        if (n <= 2){
            return 1;
        }else{
            return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
        }
    }
}
