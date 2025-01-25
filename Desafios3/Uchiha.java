package Desafios.Desafios3;

public class Uchiha extends Ninja {

    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial() {
        System.out.println("A habilidade especial do ninja " + nome + " é " + habilidadeEspecial);
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade especial: " + habilidadeEspecial);
        System.out.println("Missão: " + missao);
        System.out.println("Nivel de dificuldade: " + nivelDificuldade);
        System.out.println("Status da missão: " + statusMissao + "\n");
    }


}
