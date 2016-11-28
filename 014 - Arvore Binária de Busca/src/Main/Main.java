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
            System.out.println("9 - Sair");
            int escolha = input.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Qual o valor que você deseja inserir?");
                    teste.insere(input.nextInt());
                    break;
                case 2:
                    System.out.println("Qual o valor que você deseja procurar?");
                    teste.procurar(input.nextInt());
                    break;
                case 3:
                    teste.mostra();
                    System.out.println("");
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
