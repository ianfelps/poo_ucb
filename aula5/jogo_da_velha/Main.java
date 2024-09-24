import java.util.Scanner;

public class Main{
    private static char[][] tabuleiro = new char[3][3]; // tabuleiro
    private static char jogadorAtual = 'X'; // jogador atual
    private static JogoDaVelha jogo = new JogoDaVelha(); // classe do jogo da velha

    public static void main(String[] args) {
        jogo.inicializarTabuleiro(tabuleiro);
        Scanner scanner = new Scanner(System.in);

        // a cada rodada
        while (true) {
            // printar o tabuleiro
            jogo.imprimirTabuleiro(tabuleiro);
            System.out.println("Jogador " + jogadorAtual + ", escolha sua linha (1, 2, 3) e coluna (1, 2, 3):");
            int linha = scanner.nextInt() - 1;
            int coluna = scanner.nextInt() - 1;

            // verificar se a posicao que o usuario inseriu eh valida e esta vazia
            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != ' ') {
                System.out.println("Posicao invalida, tente novamente.");
                continue;
            }

            // atribuir o ponto a partir do jogador que esta jogando
            tabuleiro[linha][coluna] = jogadorAtual;

            // verificar possivel vencedor
            if (jogo.verificarVencedor(tabuleiro, jogadorAtual)) {
                jogo.imprimirTabuleiro(tabuleiro);
                System.out.println("Jogador " + jogadorAtual + " venceu!");
                break;
            }

            // verificar possivel empate
            if (jogo.verificarEmpate(tabuleiro)) {
                jogo.imprimirTabuleiro(tabuleiro);
                System.out.println("Empate!");
                break;
            }

            // alternar jogador
            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
        }
    }
}