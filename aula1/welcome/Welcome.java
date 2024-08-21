// compilar: javac nome_do_arquivo.java
// executar: java nome_do_arquivo.java

import java.util.Scanner; // importar classe Scanner

public class Welcome{ // criar classe (nome da classe = nome do arquivo)

    public static void main(String[] args){ // criar funcao main
        // execucao da funcao

        System.out.println("Bem vindo ao Java!"); // printar

        // criar um Scanner para obter entradas do usuario
        Scanner entrada = new Scanner(System.in); // instanciar um objeto

        // criar variaveis
        int num1, num2, soma;

        // coletar e armazenar entradas
        System.out.println("Entre com um numero: ");
        num1 = entrada.nextInt();

        System.out.println("Entre com outro numero: ");
        num2 = entrada.nextInt();

        // executar operacoes
        soma = num1 + num2;

        // printar resultado
        System.out.println("Resultado: "); // println: print com \n
        System.out.printf("A soma de %d + %d = %d", num1, num2, soma); // printf: printf da lang C

    }
}