package Desafios.Desafio4;

public class Main {
    public static void main(String[] args) {

        NinjaAvancado sasuke = new NinjaAvancado("Sasuke", 16, TipoHabilidade.KATON, "bola de fogo");
        sasuke.mostrarInformacoes();
        sasuke.executarHabilidades();

        System.out.println("");

        NinjaBasico naruto = new NinjaBasico("Naruto", 15, TipoHabilidade.NINJUTSU);
        naruto.mostrarInformacoes();
        naruto.executarHabilidades();

    }
}
