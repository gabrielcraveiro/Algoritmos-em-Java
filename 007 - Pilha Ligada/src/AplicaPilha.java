import java.util.Scanner;

/**
 * Created by Gabriel Craveiro  on 26/11/2016.
 */
public class AplicaPilha {
    public static void main(String[] args) {
        PilhaLigada teste = new PilhaLigada();
        teste.empilha(5);
        teste.empilha(10);
        teste.desempilha();
        Node aux = teste.getTopo();
        while (aux != null){
            System.out.println(aux.getInfo());
            aux = aux.getProx();
        }
    }
}
