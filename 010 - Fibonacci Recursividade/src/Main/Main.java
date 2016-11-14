package Main;

public class Main {

    public static void main(String[] args) {
        System.out.println(fibonacci(7));
        fibonacciEx(7, 0);
    }

    public static int fibonacci(int n) {
        if (n <= 2){
            return 1;
        }else{
            return fibonacci(n-2) + fibonacci(n-1);
        }
    }

    public static int fibonacciEx(int n, int c) { // Como funciona
        String indent = "";
        for (int i = 0; i < c; i++) {
            indent += " ";
        }
        System.out.println(indent + "fibonacci(" + n + ")");
        if (n < 2) {
            return 1;
        } else {
            return fibonacciEx(n - 2, c + 4) + fibonacciEx(n - 1, c + 4);
        }
    }

}
