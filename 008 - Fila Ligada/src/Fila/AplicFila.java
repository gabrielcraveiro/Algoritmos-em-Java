package Pilha;

public class AplicFila {

    public static void main(String[] args) {
        FilaLigada fila = new FilaLigada();
        fila.insere(3);
        fila.insere(5);
        fila.insere(7);
        fila.insere(2);
        fila.remove();
        fila.remove();
        Node aux = fila.getInic();
        while (aux != null){
            System.out.println(aux.getInfo());
            aux = aux.getProx();
        }

    }
}
