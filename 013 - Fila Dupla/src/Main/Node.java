package Main;

/**
 * Created by Gabriel Craveiro on 26/11/2016.
 */
public class Node {
    private int info;
    private Node prox;
    public Node() {
        info = 0;
        prox = null;
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
