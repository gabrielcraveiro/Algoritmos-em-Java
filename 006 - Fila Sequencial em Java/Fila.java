package com.company;

import java.util.Arrays;

/**
 * Created by Gabriel Craveiro on 13/11/2016.
 */
public class Fila {
    private int fila[];
    private int u;
    private int p;
    private int tamanho;
    private int qtde;

    public Fila(int tamanho) {
        this.tamanho = tamanho;
        fila = new int[tamanho];
        p = -1;
        u = -1;
        qtde = 0;
    }

    public void insere(int x) {
        if (filaCheia()) {
            System.out.println("Fila Cheia");
            return;
        }
        u++;
        if (u == this.tamanho) {
            u = 0;
        }
        fila[u] = x;
        qtde++;

    }

    public void remove() {
        if (filaVazia()) {
            System.out.println("Fila Vazia");
            return;
        }
        if (p == this.tamanho) {
            p = 0;
        } else {
            p++;
        }
        qtde--;
    }

    public boolean filaVazia() {
        return qtde <= 0;
    }

    public boolean filaCheia() {
        return qtde == this.tamanho;
    }

    @Override
    public String toString() {
        return "Fila{" +
                "fila=" + Arrays.toString(fila) +
                ", u=" + u +
                ", p=" + p +
                ", tamanho=" + tamanho +
                ", qtde=" + qtde +
                '}';
    }
}
