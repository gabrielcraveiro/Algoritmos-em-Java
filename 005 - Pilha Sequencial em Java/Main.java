package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Pilha teste = new Pilha(5);
        teste.empilhar(3);
        System.out.println(teste);
        teste.empilhar(4);
        System.out.println(teste);
        teste.empilhar(2);
        teste.desempilhar();
        System.out.println(teste);
        teste.desempilhar();
        System.out.println(teste);
        teste.empilhar(7);
        System.out.println(teste);
        teste.empilhar(4);
        System.out.println(teste);
        teste.empilhar(4);
        System.out.println(teste);
        teste.empilhar(4);
        System.out.println(teste);
        teste.empilhar(4);
        System.out.println(teste);
        teste.desempilhar();
        System.out.println(teste);
        teste.desempilhar();
        System.out.println(teste);
        teste.desempilhar();
        System.out.println(teste);
        teste.desempilhar();
        System.out.println(teste);
        teste.desempilhar();
        System.out.println(teste);
        teste.empilhar(9);
        System.out.println(teste);


    }

}
