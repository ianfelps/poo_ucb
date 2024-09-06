/*
Escreva um aplicativo que solicita ao usuário que insira o tamanho do lado de um quadrado e, então, exibe um quadrado vazio desse tamanho com asteriscos. Seu programa deve trabalhar com quadrados de todos os comprimentos de lado possíveis entre 1 e 20.
*/

import java.util.Scanner; // importar classe Scanner

public class Quadrado{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in); // instanciar Scanner

        System.out.println("--- Desenhar Quadrado ---");
        System.out.println("Insira o numero de lados do quadrado: ");
        int num_lados = input.nextInt();

        // printar topo
        for (int i = 0; i < num_lados; i++){
            System.out.printf("* ");
        }

        // printar lados
        for (int i = 0; i < num_lados - 2; i++){
            System.out.printf("\n*");
            for (int j = 0; j < (((num_lados - 2) * 2) + 1); j++){
                System.out.printf(" ");
            }
            System.out.printf("*");
        }

        System.out.printf("\n"); // quebra a linha

        // printar base
        for (int i = 0; i < num_lados; i++){
            System.out.printf("* ");
        }
    }
}