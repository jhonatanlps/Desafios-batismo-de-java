package Desafios.Desafio5;

public interface Conta {

    void consultarSaldo();

    void depositar(double valor);

    void sacarDinheiro(double valor);

    void transferir(double valor, ContaBancaria contaDestino);

}
