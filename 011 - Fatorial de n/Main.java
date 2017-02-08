package Main;

public class Main {

    public static void main(String[] args) {
        System.out.println(fatorial(6));
    }

    public static int fatorial(int n) {
        int f = 1;
        if (n != 0)
            for (int i = 1; i <= n; i++) {
                f = f * i;
            }
        return f;
    }
}
