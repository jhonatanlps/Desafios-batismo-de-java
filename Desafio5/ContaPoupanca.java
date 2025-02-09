package Desafios.Desafio5;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca() {

    }

    public ContaPoupanca(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor - (valor * 0.05);
        System.out.println("O dinheiro foi depositado com sucesso!");
    }

}
