/**
 * Created by Gabriel Craveiro on 26/11/2016.
 */
public class PilhaLigada {
    private Node topo;

    public PilhaLigada() {
        topo = null;
    }

    public void empilha(int x) { //insere x número na pilha
        Node temp = new Node(); //cria o proximo node da fila que nada mais é que um novo objeto
        temp.setInfo(x); //coloca a informação do objeto novo
        temp.setProx(topo); //e coloca pro ponteiro dele ser o topo atual
        topo = temp; //ele vira o topo e o topo atual fica alocado como próximo dele
    }

    //insere exemplificado
    //TOPO = [x / setProx] -- >
    //Temp = [x / apontaTopoAntigo] --> [x antigo/ TopoAntigoApontaParaTopoAntigoDoAntigo] --> etc

    public int desempilha() {
        int temp = topo.getInfo(); //guarda o valor antigo
        topo = topo.getProx(); //topo passa para o proximo valor do topo
        return temp; //retorna o topo
    }

    public Node getTopo() {
        return topo;
    }
}
