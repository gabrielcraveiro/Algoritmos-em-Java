package Main;

public class Main {

    public static void main(String[] args) {
        System.out.println(fatorial(6));
    }

    public static int fatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n-1);
        }
    }
}
