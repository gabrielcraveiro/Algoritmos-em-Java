package Main;

public class Main {

    public static void main(String[] args) {
        FilaDupla fila = new FilaDupla();
        fila.insereInic(3);
        fila.insereInic(2);
        fila.insereFim(4);
        fila.insereFim(5);
        fila.insereInic(1);
        fila.removeInic();
        fila.removeFim();
        Node aux = fila.getInic();
        while (aux != null){
            System.out.println(aux.getInfo());
            aux = aux.getProx();
        }
    }
}
