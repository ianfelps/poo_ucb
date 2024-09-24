import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        
        System.out.println("--- Valores Unicos ---");

        // inserir os cinco números
        System.out.println("Insira 5 numeros entre 10 e 100:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            // verificar se o numero esta entre 10 e 100
            if (numero >= 10 && numero <= 100) {
                numeros[i] = numero;
            } else {
                System.out.println("Numero fora do intervalo (10-100). Tente novamente.");
                i--; // repetir a iteracao
            }
        }

        int[] numerosUnicos = Verificacao.obterNumerosUnicos(numeros);

        // printar resultado
        System.out.println("Valores unicos inseridos:");
        for (int num : numerosUnicos) {
            System.out.print(num + " ");
        }
    }
}
