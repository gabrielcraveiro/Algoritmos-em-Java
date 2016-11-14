package com.company;

import java.util.Arrays;

/**
 * Created by Gabriel Craveiro on 13/11/2016.
 */
public class Fila {
    private int fila[];
    private int inic;
    private int fim;
    private int tamanho;

    public Fila(int tamanho) {
        this.fila = new int[tamanho];
        this.inic = -1;
        this.fim = -1;
        this.tamanho = tamanho;
    }

    public void insere(int x) {
        if (filaCheia()) {
            System.out.println("Fila cheia");
        } else {
            if (this.fim == this.tamanho-1) {
                this.fim = 0;
            } else {
                this.fim++;
            }
            this.fila[this.fim] = x;
        }
    }

    public int remove() {
        if (filaVazia()) {
            System.out.println("Fila vazia");
            return 0;
        } else {
            if (this.inic == this.tamanho-1) {
                this.inic = 0;
            } else {
                this.inic++;
            }
            return this.fila[this.inic];
        }
    }

    public boolean filaVazia() {
        return this.inic == this.fim;
    }

    public boolean filaCheia() {
        return (this.fim + 1 == this.inic || this.fim == this.tamanho-1 && this.inic == -1);
    }

    @Override
    public String toString() {
        return "Fila{" +
                "Array: " + Arrays.toString(fila) +
                ", inic=" + inic +
                ", fim=" + fim +
                ", tamanhoMaximo=" + tamanho +
                '}';
    }
}
