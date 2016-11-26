package Pilha;

/**
 * Created by Gabriel Craveiro on 25/11/2016.
 */
public class FilaLigada {
   private Node fim; //Inicia um Node para fim e inicio
    private Node inic;

    public FilaLigada() {
        fim = null; //Fim == vazio
        inic = null; //Inic == vazio
    }

    public void insere(int x) {
        Node proximoElemento = new Node(); //Cria o proximo Node pra fila
        proximoElemento.setInfo(x); //Coloca x como informação de dado pro node
        proximoElemento.setProx(null); //Manda ele apontar pra null
        if (this.inic == null) { //Se a fila estiver vazia
            inic = proximoElemento; //Inicio igual ao novo Node
        } else {
            fim.setProx(proximoElemento); //Senao prox do ultimo elemento da fila vai ser ele
        }
        fim = proximoElemento; //E ele vai ser o ultimo elemento da fila
    }

    public int remove(){
        int temp = inic.getInfo(); //Pega o dado do inicio e guarda
        inic = inic.getProx(); //O inicio passa para o segundo(prox)
        if (inic == null){ //Se o inicio ficar vazio, o fim também fica
            fim = null;
        }
        return temp; //Retorna o dado temporário do elemento que você retirou

    }

    public Node getInic() {
        return inic;
    }

    public Node getFim() {

        return fim;
    }

    public void setFim(Node fim) {
        this.fim = fim;
    }
}
