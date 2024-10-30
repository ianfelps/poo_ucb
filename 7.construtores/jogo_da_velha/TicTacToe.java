public class TicTacToe {
    public enum Celula { X, O, EMPTY }
    private Celula[][] tabuleiro;
    private Celula jogadorAtual;

    // construtor para inicializar o tabuleiro vazio e o jogador inicial
    public TicTacToe() {
        tabuleiro = new Celula[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = Celula.EMPTY;
            }
        }
        jogadorAtual = Celula.X;
    }

    // realizar uma jogada
    public boolean fazerJogada(int linha, int coluna) {
        if (linha < 0 || linha >= 3 || coluna < 0 || coluna >= 3 || tabuleiro[linha][coluna] != Celula.EMPTY) {
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
        jogadorAtual = (jogadorAtual == Celula.X) ? Celula.O : Celula.X;
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
                if (tabuleiro[i][j] == Celula.EMPTY) {
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
                    case EMPTY -> System.out.print("   ");
                }
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("-----------");
        }
    }

    // getter do jogador atual
    public Celula getJogadorAtual() {
        return jogadorAtual;
    }
}