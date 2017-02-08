package Main;

/**
 * Created by Gabriel Craveiro on 26/11/2016.
 */
public class Bst {
    private Node raiz;

    public Bst() {
        raiz = null;
    }

    public void insere(int x) {
        Node temp = new Node();
        temp.info = x;
        if (raiz == null) {
            raiz = temp;
            System.out.println("Valor inserido na raiz");
            return;
        }
        Node atual = raiz;
        Node parente = null;
        while (true) {
            parente = atual;
            if (x < atual.info) {
                atual = atual.esquerda;
                if (atual == null) {
                    parente.esquerda = temp;
                    System.out.println("Valor inserido a esquerda");
                    return;
                }
            } else {
                atual = atual.direita;
                if (atual == null) {
                    parente.direita = temp;
                    System.out.println("Valor inserido a direita");
                    return;
                }
            }
        }
    }

    public boolean procurar(int x) {
        Node temp = raiz;
        while(true) {
            if (temp.info == x) {
                return true;
            }
            if (temp.esquerda == null && temp.direita == null && temp.info != x || raiz.direita == null && raiz.info < x) {
                return false;
            }
            if (temp == null) {
                return false;
            } else {
                if (temp.info > x) {
                    temp = temp.esquerda;
                } else {
                    temp = temp.direita;
                }
            }
        }
    }

    public void préOrdem() {
        System.out.println("Pré Ordem");
        préOrdem(raiz);
        System.out.println("");
    }

    private void préOrdem(Node root){
        if(root!=null){
            System.out.print(" " + root.info);
            préOrdem(root.esquerda);
            préOrdem(root.direita);
        }
    }

    public void emOrdem() {
        System.out.println("Em Ordem");
        emOrdem(raiz);
        System.out.println("");
    }

    private void emOrdem(Node root){
        if(root!=null){
            emOrdem(root.esquerda);
            System.out.print(" " + root.info);
            emOrdem(root.direita);
        }
    }

    public void pósOrdem() {
        System.out.println("Pós Ordem");
        pósOrdem(raiz);
        System.out.println("");
    }

    private void pósOrdem(Node root){
        if(root!=null){
            pósOrdem(root.esquerda);
            pósOrdem(root.direita);
            System.out.print(" " + root.info);
        }
    }

    public void altura() {
        System.out.println("Altura é: "+altura(raiz));
    }

    private int altura(Node node) {
        if (node == null) return -1;

        return 1 + Math.max(altura(node.esquerda), altura(node.direita));
    }




}
