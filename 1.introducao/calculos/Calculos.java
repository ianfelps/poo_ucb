/*
Escreva um aplicativo que solicita ao usuário inserir dois inteiros, obtém do usuário esses números e imprime sua soma, produto, diferença e divisão.
*/

import java.util.Scanner; // importar Scanner

public class Calculos{ // criar classe

    public static void main(String[] args){ // criar funcao main

        System.out.println("--- Calculador de Numeros ---");

        Scanner input = new Scanner(System.in); // instanciar objeto Scanner

        float num1, num2, som, sub, mul, div; // criar variaveis

        // coletar e armazenar entradas
        System.out.println("Entre com o primeiro numero: ");
        num1 = input.nextFloat();

        System.out.println("Entre com o segundo numero: ");
        num2 = input.nextFloat();

        // realizar operacoes
        som = num1 + num2; // soma
        sub = num1 - num2; // subtracao
        mul = num1 * num2; // multiplicacao
        div = num1 / num2; // divisao

        // exibir resultados
        System.out.println("--- Resultados ---");
        System.out.printf("Soma: %.1f + %.1f = %.1f\n", num1, num2, som);
        System.out.printf("Subtracao: %.1f - %.1f = %.1f\n", num1, num2, sub);
        System.out.printf("Multiplicacao: %.1f * %.1f = %.1f\n", num1, num2, mul);
        System.out.printf("Divisao: %.1f / %.1f = %.1f\n", num1, num2, div);

    }
}