package Desafios.Desafio5;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente() {

    }

    public ContaCorrente(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor - (valor * 0.01);
        System.out.println("O dinheiro foi depositado com sucesso\n");
    }

}
