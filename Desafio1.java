package Desafios;

public class Desafio1 {
    public static void main(String[] args) {

        //Ninja 1
        String nomeNinja1 = "Naruto";
        int idadeNinja1 = 14;
        String nomeDaMissaoNinja1 = "virar hokage";
        char nivelDeConclusaoNinja1 = 'S';
        String statusDeConclusaoNinja1 = "Em andamento";

        System.out.println("----------------------------------------------------");
        if (idadeNinja1 < 15){
            if (nivelDeConclusaoNinja1 == 'C' || nivelDeConclusaoNinja1 == 'D'){
                statusDeConclusaoNinja1 = "Missão concluida";
            } else {
                statusDeConclusaoNinja1 = "Missão não concluida";
            }
        } else {
            statusDeConclusaoNinja1 = "Missão concluida";
        }

        System.out.println("1º Ninja");
        System.out.println("Nome: " + nomeDaMissaoNinja1);
        System.out.println("Idade: " + idadeNinja1);
        System.out.println("Nome da missão: " + nomeDaMissaoNinja1);
        System.out.println("Nivel de conclusão: " + nivelDeConclusaoNinja1);
        System.out.println("Status de conclusão: " + statusDeConclusaoNinja1);
        System.out.println("----------------------------------------------------");

        //Ninja 2
        String nomeNinja2 = "Shikamaru";
        int idadeNinja2 = 16;
        String nomeDaMissaoNinja2 = "Dormir";
        char nivelDeConclusaoNinja2 = 'D';
        String statusDeConclusaoNinja2 = "Concluido";

        if (idadeNinja2 < 15){
            if (nivelDeConclusaoNinja2 == 'C' || nivelDeConclusaoNinja2 == 'D'){
                statusDeConclusaoNinja2 = "Missão concluida";
            } else {
                statusDeConclusaoNinja2 = "Missão não concluida";
            }
        } else {
            statusDeConclusaoNinja2 = "Missão concluida";
        }

        System.out.println("2º Ninja");
        System.out.println("Nome: " + nomeNinja1);
        System.out.println("Idade: " + idadeNinja2);
        System.out.println("Nome da missão: " + nomeDaMissaoNinja2);
        System.out.println("Nivel de conclusão: " + nivelDeConclusaoNinja2);
        System.out.println("Status de conclusão: " + statusDeConclusaoNinja2);
        System.out.println("----------------------------------------------------");

        //Ninja 3
        String nomeNinja3 = "Rock Lee";
        int idadeNinja3 = 15;
        String nomeDaMissaoNinja3 = "Ser bom";
        char nivelDeConclusaoNinja3 = 'B';
        String statusDeConclusaoNinja3 = "Em andamento";

        if (idadeNinja3 < 15){
            if (nivelDeConclusaoNinja3 == 'C' || nivelDeConclusaoNinja3 == 'D'){
                statusDeConclusaoNinja3 = "Missão concluida";
            } else {
                statusDeConclusaoNinja3 = "Missão não concluida";
            }
        } else {
            statusDeConclusaoNinja3 = "Missão concluida";
        }

        System.out.println("3º Ninja");
        System.out.println("Nome: " + nomeNinja3);
        System.out.println("Idade: " + idadeNinja3);
        System.out.println("Nome da missão: " + nomeDaMissaoNinja3);
        System.out.println("Nivel de conclusão: " + nivelDeConclusaoNinja3);
        System.out.println("Status de conclusão: " + statusDeConclusaoNinja3);


    }
}
