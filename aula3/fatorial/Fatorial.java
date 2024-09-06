/*
O fatorial de um inteiro não negativo n é escrito como n! (pronuncia-se “n fatorial”) e é definido como segue:
n!= (n * (n – 1)* (n – 2)* …  * 1 (para valores de n maiores ou iguais a 1) e
n! = 1 (para n = 0)
Por exemplo, 5! = 5 * 4 * 3 * 2 * 1, o que dá 120.
Escreva um aplicativo que lê um inteiro não negativo, calcula e imprime seu fatorial.
*/

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