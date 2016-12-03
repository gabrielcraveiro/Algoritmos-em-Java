/**
 * Created by Gabriel Craveiro on 29/11/2016.
 */
public class AplicFila {
    public static void main(String[] args) {
        ListaOrdenada teste = new ListaOrdenada();
        teste.insere(15);
        teste.insere(17);
        teste.insere(13);
        teste.insere(20);
        teste.remove(15);
        teste.insere(3);
        teste.mostra();
    }
}
