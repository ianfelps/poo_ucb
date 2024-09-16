// Faça um aplicativo que verifique se o número digitado n é um número primo. Lembrando que todo número primeiro é divisível apenas por 1 ou por ele mesmo.

import java.util.Scanner;

public class Primo{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in); // instanciar Scanner

        System.out.println("--- Verificar Numero Primo ---");
        // coletar e armazenar numero
        System.out.println("Insira um numero para verificar se eh primo ou nao: ");
        int num = input.nextInt();

        boolean eh_primo = true; // variavel booleana para identificacao do numero

        for(int i = 2; i < num; i++){ // loop para testar possiveis divisoes
            if(num % i == 0){ // verificar se o numero eh divisivel por i
                eh_primo = false;
                break;
            }
        }

        // printar resultado
        System.out.println("--- Resultado ---");
        if (eh_primo == true){ // condicao para printar se o numero eh primo ou nao
            System.out.printf("O numero %d eh primo!", num);
        } else {
            System.out.printf("O numero %d nao eh primo!", num);
        }
    }
}