package Main;

/**
 * Created by Gabriell on 26/11/2016.
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
                    return;
                }
            } else {
                atual = atual.direita;
                if (atual == null) {
                    parente.direita = temp;
                    return;
                }
            }
        }
    }

    public void procurar(int x) {
        Node temp = raiz;
        while(true) {
            if (temp == null) {
                System.out.println("Árvore vazia");
                return;
            } else {
                if (temp.info > x) {
                    temp = temp.esquerda;
                } else {
                    temp = temp.direita;
                }
            }
            if (temp.esquerda == null && temp.direita == null && temp.info != x) {
                System.out.println("");
                System.out.println("Valor não foi encontrado");
                return;
            }
            if (temp.info == x) {
                System.out.println("");
                System.out.println("O valor foi encontrado");
                return;
            }
        }
    }

    public void mostra() {
        mostra(raiz);
    }

    private void mostra(Node root){
        if(root!=null){
            mostra(root.esquerda);
            System.out.print(" " + root.info);
            mostra(root.direita);
        }
    }



}
