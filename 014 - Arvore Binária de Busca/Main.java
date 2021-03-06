package Main;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Bst teste = new Bst();
        Scanner input = new Scanner(System.in);
        System.out.println("Árvore binária de Busca");
        int i = 1;
        while(i == 1) {
            System.out.println("1 - Insere");
            System.out.println("2 - Procurar valor na Árvore");
            System.out.println("3 - Mostrar a Árvore");
            System.out.println("4 - Inserir valores aleatórios");
            System.out.println("5 - Altura da árvore");
            System.out.println("9 - Sair");
            System.out.println("");
            int escolha = input.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Qual o valor que você deseja inserir?");
                    teste.insere(input.nextInt());
                    break;
                case 2:
                    System.out.println("Qual o valor que você deseja procurar?");
                    if (teste.procurar(input.nextInt())) {
                        System.out.println("Valor encontrado");
                    } else {
                        System.out.println("Valor não encontrado");}
                    break;
                case 3:
                    teste.préOrdem();
                    System.out.println("");
                    teste.emOrdem();
                    System.out.println("");
                    teste.pósOrdem();
                    System.out.println("");
                    break;
                case 4:
                    Random x = new Random();
                    System.out.println("Quantos valores?");
                    int n = input.nextInt();
                    System.out.println("Até que int?");
                    int l = input.nextInt();
                    for (int j = 0; j <= n; j++) {
                        teste.insere(x.nextInt(l+1));
                    }
                    break;
                case 5:
                    teste.altura();
                    break;
                case 9:
                    i = 2;
                    break;
                default:
                    System.out.println("Este não é um número válido");
            }
        }
    }
}
