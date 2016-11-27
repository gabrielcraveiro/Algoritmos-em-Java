package Main;

/**
 * Created by Gabriell on 26/11/2016.
 */
public class Node {
    Node esquerda;
    Node direita;
    int info;

    public Node() {
        esquerda = null;
        direita = null;
    }

    public Node getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Node esquerda) {
        this.esquerda = esquerda;
    }

    public Node getDireita() {
        return direita;
    }

    public void setDireita(Node direita) {
        this.direita = direita;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }
}
