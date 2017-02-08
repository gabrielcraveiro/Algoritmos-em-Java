/**
 * Created by Gabriel Craveiro on 29/11/2016.
 */
public class ListaOrdenada {
    private Node p;

    public ListaOrdenada(){
        p = null;
    }

    public Node getP() {
        return p;
    }

    public void setP(Node p) {
        this.p = p;
    }

    public void insere(int x) {
        Node aux = new Node();
        aux.setInfo(x);
        if (p == null || x < p.getInfo()) {
            aux.setProx(p);
            p = aux;
        } else {
            Node aux2 = p;
            while ((aux2.getProx() != null) && (x > aux2.getProx().getInfo())) {
                aux2 = aux2.getProx();
            }
            aux.setProx(aux2.getProx());
            aux2.setProx(aux);
        }

    }

    public int remove(int x) {
        Node aux = p;
        Node aux2 = aux;
        while (aux != null) {
            aux = aux.getProx();
            if (aux.getInfo() == x) {
                int temp = aux.getInfo();
                aux2.setProx(aux.getProx());
                return temp;
            }
        }
        return 0;
    }

    public void mostra() {
        Node aux = p;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getProx();
        }
    }

}
