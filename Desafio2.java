package Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        int cadastros = 0;
        System.out.print("Qual será o maximo de ninjas que você vai cadastrar? ");
        int quantidade = scanner.nextInt();
        String[] ninjas = new String[quantidade];

        while (opcao != 3) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (cadastros == quantidade) {
                        System.out.println("Os cadastros já está no limite");
                    } else {
                        System.out.print("Qual será o nome do ninja? ");
                        String ninja = scanner.nextLine();
                        ninjas[cadastros] = ninja;
                        cadastros++;
                    }
                    break;
                case 2:
                    if (cadastros == 0) {
                        System.out.println("Sem nenhum ninja cadastrado");
                    } else {
                        for (int i = 0; i < cadastros; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Fechando o programa....");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }

        }
        scanner.close();
    }
}
