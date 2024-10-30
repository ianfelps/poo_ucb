public class TicTacToe {
    public enum Posicao { X, O, EMPTY }
    private Posicao[][] tabuleiro;
    private Posicao jogadorAtual;

    // construtor para inicializar o tabuleiro vazio e o jogador inicial
    public TicTacToe() {
        tabuleiro = new Posicao[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = Posicao.EMPTY;
            }
        }
        jogadorAtual = Posicao.X;
    }

    // realizar uma jogada
    public boolean fazerJogada(int linha, int coluna) {
        if (linha < 0 || linha >= 3 || coluna < 0 || coluna >= 3 || tabuleiro[linha][coluna] != Posicao.EMPTY) {
            System.out.println("Movimento invalido. Tente novamente.");
            return false;
        }

        tabuleiro[linha][coluna] = jogadorAtual;
        if (verificarVitoria()) {
            System.out.println("Jogador " + jogadorAtual + " venceu!");
            return true;
        } else if (verificarEmpate()) {
            System.out.println("Empate!");
            return true;
        }

        // alternar entre os jogadores
        jogadorAtual = (jogadorAtual == Posicao.X) ? Posicao.O : Posicao.X;
        return false;
    }

    // verificar se houve vitoria de algum jogador
    private boolean verificarVitoria() {
        // verifica linhas, colunas e diagonais
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) {
                return true;
            }
            if (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual) {
                return true;
            }
        }
        if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) {
            return true;
        }
        if (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual) {
            return true;
        }
        return false;
    }

    // verificar se houve empate
    private boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == Posicao.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    // funcao exibir o tabuleiro
    public void mostrarTabuleiro() { 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (tabuleiro[i][j]) {
                    case X -> System.out.print(" X ");
                    case O -> System.out.print(" O ");
                    case EMPTY -> System.out.print(" . ");
                }
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("-----------");
        }
    }

    // getter do jogador atual
    public Posicao getJogadorAtual() {
        return jogadorAtual;
    }
}