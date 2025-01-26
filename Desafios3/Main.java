package Desafios.Desafios3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int limite = 4;
        Ninja[] listaNinja = new Ninja[limite];
        Uchiha[] listaUchiha = new Uchiha[limite];
        int opcao = 0;
        int contagemNinja = 0;
        int contagemUchiha = 0;


        while (opcao != 4) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Atualizar as habilidades especiais");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n===== Adicionar novos ninjas =====");
                    System.out.println("\nSeu ninja será uchiha? ");
                    String simOuNao = scanner.nextLine();
                    if (simOuNao.equals("SIM")) {
                        if (contagemUchiha < 4) {
                            Uchiha NinjaUchiha = new Uchiha();
                            System.out.println("Qual nome do seu ninja? ");
                            NinjaUchiha.nome = scanner.nextLine();
                            System.out.println("Qual a idade do seu ninja? ");
                            NinjaUchiha.idade = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Qual a habilidade especial do seu ninja? ");
                            NinjaUchiha.habilidadeEspecial = scanner.nextLine();
                            System.out.println("Qual é o nome da missão? ");
                            NinjaUchiha.missao = scanner.nextLine();
                            System.out.println("Qual é o nivel da dificuldade? ");
                            NinjaUchiha.nivelDificuldade = scanner.nextLine();
                            System.out.println("Qual é o status da missão? ");
                            NinjaUchiha.statusMissao = scanner.nextLine();
                            listaUchiha[contagemUchiha] = NinjaUchiha;
                            contagemUchiha++;
                        } else {
                            System.out.println("Limite de ninjas atingidos");
                        }
                    } else {
                        if (contagemNinja < 4) {
                            Ninja Ninja = new Ninja();
                            System.out.println("Qual nome do seu ninja? ");
                            Ninja.nome = scanner.nextLine();
                            System.out.println("Qual a idade do seu ninja? ");
                            Ninja.idade = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Qual é o nome da missão? ");
                            Ninja.missao = scanner.nextLine();
                            System.out.println("Qual é o nivel da dificuldade? ");
                            Ninja.nivelDificuldade = scanner.nextLine();
                            System.out.println("Qual é o status da missão? ");
                            Ninja.statusMissao = scanner.nextLine();
                            listaNinja[contagemNinja] = Ninja;
                            contagemNinja++;
                        } else {
                            System.out.println("Limite de ninjas atingidos");
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n===== Lista de informações de todos dos ninja =====");
                    if (contagemUchiha == 0 && contagemNinja == 0) {
                        System.out.println("Nenhum ninja cadastrado");
                    } else {
                        if (contagemNinja > 0) {
                            for (int i = 0; i < contagemNinja; i++) {
                                listaNinja[i].mostrarInformacoes();
                            }
                        }
                        if (contagemUchiha > 0) {
                            for (int i = 0; i < contagemUchiha; i++) {
                                listaUchiha[i].mostrarInformacoes();
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n===== Alterar habilidade especial =====");
                    if (contagemUchiha == 0) {
                        System.out.println("Nenhum ninja Uchiha cadastrado");
                    } else {
                        for (int i = 0; i < contagemUchiha; i++) {
                            System.out.println(i + ". " + listaUchiha[i].nome);
                        }
                        System.out.println("Qual é o ninja que você quer atualizar a habilidade especial");
                        int ninjaAtualizar = scanner.nextInt();
                        scanner.nextLine();
                        if (ninjaAtualizar < 0 || ninjaAtualizar > contagemUchiha) {
                            System.out.println("Esse ninja não existe");
                        } else {
                            System.out.println("Qual é a nova habilidade especial dele? ");
                            listaUchiha[ninjaAtualizar].habilidadeEspecial = scanner.nextLine();
                            System.out.println("Atualização feita!!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Finalizando o programa.....");
                    break;

                default:
                    System.out.println("Opção inválida, tente de novo");
                    break;
            }

        }
        scanner.close();
    }
}
