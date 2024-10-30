import java.util.ArrayList;

public class JogoDaForca{

    // preencher a lista de letras corretas com "_"
    public static void preencherLetrasCorretas(String palavraSecreta, ArrayList<Character> letrasCorretas) {
        for (int i = 0; i < palavraSecreta.length(); i++) {
            letrasCorretas.add('_');
        }
    }

    // exibir a palavra com as letras corretas e os underscores
    public static String exibirPalavra(ArrayList<Character> letrasCorretas) {
        StringBuilder palavra = new StringBuilder();
        for (char letra : letrasCorretas) {
            palavra.append(letra).append(" ");
        }
        return palavra.toString().trim();
    }

    // atualizar a lista de letras corretas com a letra adivinhada
    public static void atualizarLetrasCorretas(String palavraSecreta, char tentativa, ArrayList<Character> letrasCorretas) {
        for (int i = 0; i < palavraSecreta.length(); i++) {
            if (palavraSecreta.charAt(i) == tentativa) {
                letrasCorretas.set(i, tentativa);
            }
        }
    }

    // mostrar o resultado final
    public static void mostrarResultado(boolean venceu, String palavraSecreta) {
        if (venceu) {
            System.out.println("Parabéns! Voce adivinhou a palavra: " + palavraSecreta);
        } else {
            System.out.println("Voce perdeu! A palavra era: " + palavraSecreta);
        }
    }
}
