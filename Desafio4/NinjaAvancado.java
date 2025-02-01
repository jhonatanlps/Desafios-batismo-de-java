package Desafios.Desafio4;

public class NinjaAvancado implements Ninja{

    String nome;
    int idade;
    TipoHabilidade habilidade;
    String especialidade;


    public NinjaAvancado(String nome, int idade, TipoHabilidade habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    public NinjaAvancado() {

    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Especialidade: " + especialidade);
    }

    @Override
    public void executarHabilidades() {
        System.out.println("Minha habilidade é " + habilidade + ", e estou ativando ela");
    }
}
