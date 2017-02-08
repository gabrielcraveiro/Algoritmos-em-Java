/**
 * Created by Gabriel Craveiro on 26/11/2016.
 */
public class Node {
    private Node prox; //Um node é feito com 2 informações, a info dele e um Node apontando para o próximo da fila.
    private int info; // [info/node->[info/node-> null

    public Node() { //Começa vazio e apontando para Null
        prox = null;
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
