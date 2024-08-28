import java.util.Scanner; // importar scanner
import javax.swing.JOptionPane; // importar tela (interface grafica)

public class CachorroTest{ // classe main

    public static void main(String[] args){ // metodo main (execucao)

        Scanner input = new Scanner(System.in); // declarar e instanciar Scanner

        String nomeCachorro;

        // System.out.println("Qual o nome do seu cachorro? ");
        // nomeCachorro = input.nextLine(); // coletar dado do usuario

        nomeCachorro = JOptionPane.showInputDialog(null, "Qual o nome do seu cachorro? "); // iniciar tela de input

        Cachorro meuCachorro = new Cachorro(nomeCachorro); // declarar e instanciar objeto da classe cachorro (com construtor)

        System.out.printf("\nO nome do seu cachorro eh %s!\n", meuCachorro.getName());

        meuCachorro.latir(); // chamar metodo da classe cachorro
        meuCachorro.lamber(); // chamar outro metodo

        // alterar nome
        meuCachorro.setNome("Belinha"); // setar atributo da classe Cachorro via metodo
        
        System.out.printf("\nO nome do seu cachorro eh %s!\n", meuCachorro.getName());
        meuCachorro.latir(); // chamar metodo da classe cachorro
        meuCachorro.lamber(); // chamar outro metodo

    }
}