/*
Escreva um aplicativo que insere um número consistindo em cinco dígitos do usuário, separa o número em seus dígitos individuais e imprime os dígitos separados uns dos outros por três espaços cada. Por exemplo, se o usuário digitar o número 42339, o programa deve imprimir: 4 2 3 3 9.
*/

import java.util.Scanner; // importar Scanner

public class SepararNumeros{ // criar classe

    public static void main(String[] args){ // criar funcao main

        System.out.println("--- Separador de Numeros ---");

        Scanner input = new Scanner(System.in); // instanciar objeto Scanner

        int num, aux; // criar variavel

        // coletar e armazenar entrada
        System.out.println("Entre com um numero de 5 digitos: ");
        num = input.nextInt();

       if (num < 100000 && num > 9999){ // verificar se o numero possui 5 digitos
            System.out.println("--- Resultado ---");
            System.out.printf("%d   ", aux = num / 10000);
            System.out.printf("%d   ", aux = (num / 1000) % 10);
            System.out.printf("%d   ", aux = ((num / 100) % 100) % 10);
            System.out.printf("%d   ", aux = (((num / 10) % 1000) % 100) % 10);
            System.out.printf("%d   ", aux = (((num % 100000) % 1000) % 100) % 10);
        } else{
            System.out.println("--- Resultado Negado ---");
            System.out.println("O numero inserido nao possui 5 digitos.");
        }

        /*
        // criar laço de repeticao (ordem inversa)
        while (num > 0){
            System.out.printf("%d   ", num % 10);
            num /= 10;
        } */

    }
}