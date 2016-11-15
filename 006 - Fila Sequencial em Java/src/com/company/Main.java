package com.company;


import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Fila fila = new Fila(3);

        System.out.println("Encher a fila com 3 elementos");
        for (int i = 1; i <= 3; i++) {
            fila.insere(1);
            System.out.println(fila);
        }
        System.out.println();
        System.out.println("Esvaziar a fila");
        for (int i = 1; i <= 3; i++) {
            fila.remove();
            System.out.println(fila);
        }
        System.out.println(fila);
        for (int i = 1; i <= 3; i++) {
            fila.insere(2);
            System.out.println(fila);
        }
        System.out.println();
        for (int i = 1; i <= 4; i++) {
            fila.remove();
            System.out.println(fila);
        }
        for (int i = 1; i <= 4; i++) {
            fila.insere(3);
            System.out.println(fila);
        }
    }
}
