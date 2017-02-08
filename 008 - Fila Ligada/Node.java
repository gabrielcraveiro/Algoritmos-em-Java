package Pilha;

/**
 * Created by Gabriel Craveiro on 14/11/2016.
 */
public class Node {
    private Node prox; //O node é um retangulo dividido em dois, ele contem 2 informações, o dado dele e um ponteiro pro proximo
    private int info; // [info/prox]-->[info/prox]

    public Node() {
        prox = null; //Quando você cria um Node o prox dele é vazio
        info = 0;
    }

    public Node getProx() {
        return prox;
    }

    public void setProx(Node prox) {
        this.prox = prox;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

}
