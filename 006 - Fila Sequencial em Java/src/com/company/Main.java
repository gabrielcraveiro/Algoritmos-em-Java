package com.company;


import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Fila fila = new Fila(10);

        System.out.println(fila);
        for (int i = 0; i < 12; i++) {
            fila.insere(i);
            System.out.println(fila);
        }
        System.out.println("remove");
        for (int i = 0; i < 5; i++) {
            fila.remove();
            System.out.println(fila);
        }
        System.out.println("insere 4");
        for (int i = 0; i < 5; i++) {
            fila.insere(i+10);
            System.out.println(fila);
        }
        System.out.println("remove até pilha vazia");
        for (int i = 0; i < 10; i++) {
            fila.remove();
            System.out.println(fila);
        }
    }
}
