package Desafios.Desafio5;

import java.util.Scanner;

public class Banco {
    Scanner scanner = new Scanner(System.in);
    boolean programaAberto = true;
    ContaCorrente contaCorrente = new ContaCorrente(0, TipoConta.CORRENTE);
    ContaPoupanca contaPoupanca = new ContaPoupanca(0, TipoConta.POUPANCA);
    int opcao;

    public void exibirMenuDeSelecaoDeConta(){
        while (programaAberto) {
            System.out.println("===================== MENU =====================");
            System.out.println("| 1. Conta corrente                            |");
            System.out.println("| 2. Conta poupança                            |");
            System.out.println("| 3. Sair                                      |");
            System.out.println("================================================");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    exibirMenuDeAcao(contaCorrente);
                    break;

                case 2:
                    exibirMenuDeAcao(contaPoupanca);
                    break;

                case 3:
                    System.out.println("Fechando o programa...");
                    programaAberto = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    public void exibirMenuDeAcao(ContaBancaria contaBancaria){
        while (opcao != 5) {
            System.out.println("===================== MENU DA CONTA " + contaBancaria.tipoConta + " =====================");
            System.out.println("| 1. Consultar saldo                                             |");
            System.out.println("| 2. Depositar saldo                                             |");
            System.out.println("| 3. Sacar Dinheiro                                              |");
            System.out.println("| 4. Tranferência                                                |");
            System.out.println("| 5. Voltar                                                      |");
            System.out.println("==================================================================");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    contaBancaria.consultarSaldo();
                    break;

                case 2:
                    deposito(contaBancaria);
                    break;

                case 3:
                    sacar(contaBancaria);
                    break;

                case 4:
                    transferencia(contaBancaria);
                    break;

                case 5:
                    System.out.println("Voltando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    public void deposito(ContaBancaria contaBancaria){
        System.out.println("Quanto você quer depositar? ");
        double valor = scanner.nextDouble();
        contaBancaria.depositar(valor);
    }

    public void sacar(ContaBancaria contaBancaria){
        System.out.println("Quanto você quer sacar? ");
        double valor = scanner.nextDouble();
        contaBancaria.sacarDinheiro(valor);
    }

    public void transferencia(ContaBancaria contaBancaria){
        System.out.println("Quanto você quer transferir? ");
        double valor = scanner.nextDouble();
        if (contaBancaria.tipoConta == TipoConta.POUPANCA){
            contaBancaria.transferir(valor, contaCorrente);
        } else {
            contaBancaria.transferir(valor, contaPoupanca);
        }
    }
}
