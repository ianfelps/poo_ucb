import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // numero de elementos
        System.out.print("Digite a quantidade de numeros: ");
        int n = scanner.nextInt();
        double[] numeros = new double[n];

        // elementos
        System.out.println("Digite os numeros:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextDouble();
        }

        // obter a media e o desvio padrão
        double media = Calculos.calcularMedia(numeros);
        System.out.printf("A media eh: %.2f\n", media);

        double desvioPadrao = Calculos.calcularDesvioPadrao(numeros, media);
        System.out.printf("O desvio padrao eh: %.2f\n", desvioPadrao);
    }
}
