package Main;

/**
 * Created by Gabriel Craveiro on 26/11/2016.
 */
public class FilaDupla {
    private Node inic;
    private Node fim;

    public FilaDupla() {
        inic = null;
        fim = null;
    }

    public void insereInic(int x) { //Inserir node no Inicio
        Node temp = new Node(); //Cria o ponteiro auxiliar
        temp.setInfo(x);
        if (inic == null) { //Se estiver vazio esse ponteiro é o inicio e o fim
            inic = temp;
            fim = temp;
        } else {
            temp.setProx(inic); //Se não estiver vazio o proximo do auxiliar é o inicio atual
        }
        inic = temp; //O ponteiro auxiliar vira o inicio
    }

    public void insereFim(int x) { //Inserir node no Fim
        Node temp = new Node(); //Cria o node auxiliar
        temp.setInfo(x);
        fim.setProx(temp); //Deixa o ponteiro proximo do fim para o node auxiliar
        fim = temp; //O fim vira o node auxiliar
    }

    public Node getInic() {
        return inic;
    }

    public Node getFim() {

        return fim;
    }

}
