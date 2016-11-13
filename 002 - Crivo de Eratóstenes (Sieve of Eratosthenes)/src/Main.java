package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int n = input.nextInt();

        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // marca todos os numeros <= n usando o Crivo
        for (int factor = 2; factor * factor <= n; factor++) {

            // Se o fator for primo então todos os multiplos são não primos
            if (isPrime[factor]) {
                for (int j = factor; factor * j <= n; j++) {
                    isPrime[factor * j] = false;
                }
            }
        }

        System.out.println("O número "+n+" é primo ?");
        System.out.println(isPrime[n]);
    }
}
