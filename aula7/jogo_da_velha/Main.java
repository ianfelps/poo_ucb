import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TicTacToe jogo = new TicTacToe();
        boolean finalJogo = false;

        System.out.println("--- Jogo da Velha ---");

        while (!finalJogo) {
            jogo.mostrarTabuleiro();
            System.out.println("Jogador " + (jogo.getJogadorAtual() == TicTacToe.Posicao.X ? "X" : "O") + ", faca sua jogada!");
            System.out.print("Digite a linha (1, 2 ou 3): ");
            int linha = input.nextInt();
            System.out.print("Digite a coluna (1, 2 ou 3): ");
            int coluna = input.nextInt();

            finalJogo = jogo.fazerJogada(linha - 1, coluna - 1);
        }

        jogo.mostrarTabuleiro();
        System.out.println("Fim do jogo!");
    }
}
