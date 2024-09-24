public class DiarioNotas{

    private String nomeCurso;
    private int[] notas;

    // construtor
    public DiarioNotas(String nomeCurso, int[] notas) {
        this.nomeCurso = nomeCurso;
        this.notas = notas;
    }

    // obter a maior nota
    public int obterMaiorNota() {
        int maior = notas[0];
        for (int nota : notas) {
            if (nota > maior) {
                maior = nota;
            }
        }
        return maior;
    }

    // obter a menor nota
    public int obterMenorNota() {
        int menor = notas[0];
        for (int nota : notas) {
            if (nota < menor) {
                menor = nota;
            }
        }
        return menor;
    }

    // calcular a media das notas
    public double calcularMedia() {
        int soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
        return (double) soma / notas.length;
    }

    // exibir gráfico de barras
    public void exibirGraficoDeBarras() {
        System.out.println("Distribuição das notas no gráfico de barras:");
        int[] frequencia = new int[11]; // 0-100, 10 intervalos

        // contar a frequencia das notas
        for (int nota : notas) {
            ++frequencia[nota / 10];
        }

        // exibir o grafico de barras
        for (int i = 0; i < frequencia.length; i++) {
            if (i == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            }

            for (int estrelas = 0; estrelas < frequencia[i]; estrelas++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // exibir o relatorio das notas
    public void exibirRelatorio() {
        System.out.println("Relatorio de Notas do Curso: " + nomeCurso);
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Estudante %d: %d\n", i + 1, notas[i]);
        }
        System.out.printf("Maior nota: %d\n", obterMaiorNota());
        System.out.printf("Menor nota: %d\n", obterMenorNota());
        System.out.printf("Media da turma: %.2f\n", calcularMedia());
        exibirGraficoDeBarras();
    }
}