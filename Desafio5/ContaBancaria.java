package Desafios.Desafio5;

public abstract class ContaBancaria implements Conta{

    double saldo;
    TipoConta tipoConta;

    public ContaBancaria() {

    }

    public ContaBancaria(double saldo, TipoConta tipoConta) {
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public void consultarSaldo() {
        System.out.printf("Saldo: R$ %,.2f \n\n", saldo );
    }

    @Override
    public abstract void depositar(double valor);

    @Override
    public void sacarDinheiro(double valor) {
        if (this.saldo >= valor) {
            System.out.println("O dinheiro está sendo sacado...");
            this.saldo -= valor;
            System.out.println("O dinheiro foi sacado!\n");
        } else {
            System.out.println("Não é possível sacar esse valor!\n");
        }
    }

    @Override
    public void transferir(double valor, ContaBancaria contaBancaria) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Tranferindo o dinheiro...");
            contaBancaria.saldo += valor;
            System.out.println("O dinheiro foi transferido com sucesso\n");
        } else {
            System.out.println("Não é possível transferir esse valor!\n");
        }
    }
}
