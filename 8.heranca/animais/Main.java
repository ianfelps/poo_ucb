public class Main{ // classe para executar e testar

    public static void main(String[] args){

        // criar objetos de cada classe concreta
        Elefante elefante = new Elefante("Dumbo", 83, "Cinza"); // nome, idade, corPelo
        Tigre tigre = new Tigre("Tony", 72, "Laranja e Preto"); // nome, idade, corPelo
        Pinguim pinguim = new Pinguim("Pingu", 5, 30); // nome, idade, tamanhoAsa
        Aguia aguia = new Aguia("Senu", 7, 90); // nome, idade, tamanhoAsa

        // testar os metodos e atributos
        System.out.println("--- Animais ---");

        // elefante
        System.out.println("- Elefante -");
        System.out.println("Nome: " + elefante.getNome());
        System.out.println("Idade: " + elefante.getIdade());
        System.out.println("Cor do Pelo: " + elefante.getCorPelo());
        elefante.emitirSom();

        // tigre
        System.out.println("- Tigre -");
        System.out.println("Nome: " + tigre.getNome());
        System.out.println("Idade: " + tigre.getIdade());
        System.out.println("Cor do Pelo: " + tigre.getCorPelo());
        tigre.emitirSom();

        // pinguim
        System.out.println("- Pinguim -");
        System.out.println("Nome: " + pinguim.getNome());
        System.out.println("Idade: " + pinguim.getIdade());
        System.out.println("Tamanho da asa: " + pinguim.getTamanhoAsa() + " cm");
        pinguim.emitirSom();

        // aguia
        System.out.println("- Aguia -");
        System.out.println("Nome: " + aguia.getNome());
        System.out.println("Idade: " + aguia.getIdade());
        System.out.println("Tamanho da asa: " + aguia.getTamanhoAsa() + " cm");
        aguia.emitirSom();
    }
}