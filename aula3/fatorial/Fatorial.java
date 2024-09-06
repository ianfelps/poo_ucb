import java.util.Scanner;

public class Fatorial{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("--- Calculadora Fatorial ---");
        System.out.println("Insira o numero que deseja calcular: ");
        int numero = input.nextInt();
        int resultado = 1;

        System.out.printf("!%d = ", numero);

        // calculo
        for (int i = numero; i > 0; i--) {
            resultado *= i;
            if (i == 1) { // último número, não imprime o "*".
                System.out.printf("%d ", i);
            } else {
                System.out.printf("%d * ", i);
            }
        }

        System.out.printf("= %d", resultado);


    }

}