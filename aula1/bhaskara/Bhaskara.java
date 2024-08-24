/*
Escreva um aplicativo que receba a, b e c, coeficientes de uma equação do segundo grau, e calcule as raízes x’ e x” através da fórmula de Bháskara.
*/

import java.util.Scanner; // importar Scanner

public class Bhaskara{ // criar classe

    public static void main(String[] args){ // criar funcao main

        System.out.println("--- Calculadora de Baskara ---");

        Scanner input = new Scanner(System.in); // instanciar objeto Scanner

        float coeA, coeB, coeC, delta, x1, x2; // criar variaveis

        System.out.println("Equação do 2o grau: Ax² + Bx + Cx = 0");

        // coletar e armazenar entradas
        System.out.println("Entre com o coeficiente A: ");
        coeA = input.nextFloat();

        System.out.println("Entre com o coeficiente B: ");
        coeB = input.nextFloat();

        System.out.println("Entre com o coeficiente C: ");
        coeC = input.nextFloat();

        if (coeA != 0){ // verificar se coeA eh diferente de 0
            // realizar operacoes
            delta = (coeB * coeB) - (4 * coeA * coeC); // calculo de delta
            if (delta < 0){ // verificar se delta eh < 0
                System.out.println("--- Resultado ---");
                System.out.println("Delta < 0. Equacao nao possui valores reais");
            } else{
                // calcular x' e x''
                x1 = (-coeB + (float)Math.sqrt(delta)) / (2 * coeA);
                x2 = (-coeB - (float)Math.sqrt(delta)) / (2 * coeA);
                // printar resultados
                System.out.println("--- Resultado ---");
                System.out.printf("x1 = %.2f \nx2 = %.2f", x1, x2);
            }
        } else {
            System.out.println("--- Erro ---");
            System.out.println("O coeficiente A eh igual a 0, logo nao existe equacao do 2o grau.");
        }

    }
}