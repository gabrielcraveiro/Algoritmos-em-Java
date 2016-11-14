package com.company;

import java.util.Arrays;

/**
 * Created by Gabriel on 13/11/2016.
 */
public class Pilha {
    private int tamanho; //Tamanho maximo da Pilha
    private int pilha[]; //Array para a pilha
    private int topo; //Onde o index vai estar em casa passo

    public Pilha(int tamanho) { //Cria uma pilha com o parametro designado
        this.tamanho = tamanho;
        this.pilha = new int[tamanho];
        this.topo = -1; //Pilha vazia

    }

    public void empilhar(int elemento) {
        if (pilhaCheia()) { //Se a pilha estiver cheia não pode ser empilhado
            System.out.println("Stack Overflow");
        } else {
            topo++; //topo cresce em 1 e nesse lugar é colocado o elemento
            this.pilha[topo] = elemento;
        }
    }

    public int desempilhar() {
        if (pilhaVazia()) { //Se a pilha estiver vazia não pode ser desempilhada
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int temp = this.pilha[topo];
            topo--; //Retorna um espaço no Array
            return temp;
        }
    }

    public boolean pilhaVazia() {
        return this.topo == -1;
    }

    public boolean pilhaCheia() {
        return this.topo == this.tamanho-1;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.pilha);
    }
}
