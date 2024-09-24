import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String palavraSecreta = "paralelepipedo";
        ArrayList<Character> letrasTentadas = new ArrayList<>();
        ArrayList<Character> letrasCorretas = new ArrayList<>();

        // preencher a lista de letras corretas com "_"
        JogoDaForca.preencherLetrasCorretas(palavraSecreta, letrasCorretas);

        int chances = 6;
        boolean venceu = false;

        System.out.println("--- Jogo da Forca ---");

        while (chances > 0 && !venceu) {
            System.out.println("Palavra: " + JogoDaForca.exibirPalavra(letrasCorretas));
            System.out.println("Chances restantes: " + chances);
            System.out.print("Digite uma letra: ");
            char tentativa = input.next().charAt(0);

            // verificar se a letra ja foi tentada
            if (letrasTentadas.contains(tentativa)) {
                System.out.println("Voce ja tentou essa letra. Tente outra.");
                continue;
            }

            letrasTentadas.add(tentativa);

            // verificar se a letra esta na palavra secreta
            if (palavraSecreta.indexOf(tentativa) >= 0) {
                JogoDaForca.atualizarLetrasCorretas(palavraSecreta, tentativa, letrasCorretas);

                // verificar se o jogador venceu
                if (!letrasCorretas.contains('_')) {
                    venceu = true;
                }
            } else {
                chances--;
                System.out.println("Letra incorreta!");
            }
        }

        // resultado do jogo
        JogoDaForca.mostrarResultado(venceu, palavraSecreta);
    }
}