// De acordo com o CNNMoney.com, o Facebook alcançou um bilhão de usuários em outubro de 2012. Supondo que a base de usuários cresça a uma taxa de 4% ao mês, quantos meses levarão para que o Facebook aumente sua base de usuários para 1,5 bilhão? Quantos meses serão necessários para que o Facebook expanda sua base de usuários para dois bilhões?

import java.util.Scanner;

public class TaxaMensal{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in); // instanciar scanner

        System.out.println("--- Aumento por Porcentagem ---");

        // coletar e armazenar dados
        System.out.println("Insira o valor base (em bilhoes): ");
        double valor_base = input.nextDouble();

        System.out.println("Insira a taxa de crescimento (em %): ");
        double taxa = input.nextDouble();

        taxa /= 100.0; // taxa eh uma porcentagem

        System.out.println("Insira o valor alvo (em bilhoes): ");
        double valor_alvo = input.nextDouble();

        int meses = 0; // iniciar a variavel meses
        double valor_inicial = valor_base; // guardar o valor inicial para printar no resultado

        // loop para incrementar o valor base ate que atinja o valor alvo
        while (valor_base < valor_alvo){
            valor_base += valor_base * taxa; // calculo da taxa
            meses++; // adiciona um mes
        }

        // printar resultado
        System.out.println("--- Resultado ---");
        System.out.printf("Para aumentar o valor base de %.1f bi para %.1f bi com uma taxa de %.0f%%, precisa de %d meses!", valor_inicial, valor_alvo, taxa * 100, meses);
    }
}