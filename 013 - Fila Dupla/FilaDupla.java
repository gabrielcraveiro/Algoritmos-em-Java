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

    public int removeInic() { //Remover inicio é simples, só apontar o inicio para o proximo.
        int temp = inic.getInfo();
        inic = inic.getProx();
        return temp;
    }

    public int removeFim() { //Para remover o fim é necessário percorrer toda a fila até o ultimo elemento antes do fim.
        Node aux = inic;
        while (aux.getProx().getProx() != null){ //Se o proximo do proximo for null o aux vai ser ele, ou seja,
            aux = aux.getProx(); //Em uma fila de 1 2 3 4 5, quando o ponteiro estiver no 4 o proximo(5) do proximo(null)
        }                        //Vai ser null.
        int temp = aux.getInfo();
        fim = aux;
        fim.setProx(null);
        return temp;
    }

    public Node getInic() {
        return inic;
    }

    public Node getFim() {
        return fim;
    }

}
