package algoritmo.de.euclides;

import java.util.Scanner;

public class AlgoritmoDeEuclides {

    public static void main(String[] args) {
        Scanner gcdReader = new Scanner(System.in);
        System.out.println("Primeiro número: ");
        int n = gcdReader.nextInt();
        System.out.println("Segundo número: ");
        int m = gcdReader.nextInt();
        System.out.println("GCD(" + n + "," + m + ") = " + gcd(n, m));
    }

    public static int gcd(int n, int m) {
        while (n > 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    }

}