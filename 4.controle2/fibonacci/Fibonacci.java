// A série de Fibonacci é 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.... Os dois primeiros termos são iguais a 1, e a partir do terceiro, o termo é dado pela soma dos dois termos anteriores. Dado um número n ≥ 3, exiba o n-ésimo termo da série de Fibonacci. (Não use recursivo.)

import java.util.Scanner;

public class Fibonacci{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in); // instanciar scanner

        System.out.println("--- Fibonacci ---");
        // coletar e armazenar o numero da posicao
        System.out.println("Insira o numero da posicao na sequencia de Fibonacci desejado: ");
        int pos = input.nextInt();

        long num1 = 1, num2 = 1, aux; // criar variaveis

        // calculo da sequencia de fibonacci
        for (int i = 2; i < pos; i++){ 
            // usar variavel auxiliar para manter o numero anterior da sequencia
            aux = num2;
            num2 = num2 + num1;
            num1 = aux;
        }

        // printar o resultado
        System.out.println("--- Resultado ---");
        System.out.printf("O %do da sequencia de Fibonacci eh %d!", pos, num2);
    }
}