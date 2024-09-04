/*
Os motoristas se preocupam com a quilometragem obtida por seus automóveis. Um motorista monitorou várias viagens registrando a quilometragem dirigida e a quantidade de combustível em litros utilizados para cada tanque cheio. Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos e os litros de gasolina consumidos (ambos como inteiros) para cada viagem. O programa deve calcular e exibir o consumo em quilômetros/litro para cada viagem e imprimir a quilometragem total e a soma total de litros de combustível consumidos até esse ponto para todas as viagens. Todos os cálculos de média devem produzir resultados de ponto flutuante. Utilize classe Scanner e repetição controlada por seleção para obter os dados do usuário.
*/

import java.util.Scanner; // importar classe Scanner

public class Calculadora{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in); // instanciar scanner

        int aux_combustivel, aux_quilometragem;
        double calculo_total = 0, combustivel_total = 0, quilometragem_total = 0;
        int vezes = 1;

        // coletar dado de quantas viagens
        System.out.println("--- Calculadora Km por L ---");
        System.out.println("Insira a quantidade de viagens: ");
        int viagens = input.nextInt();

        // coletar dado de cada viagem
        while (vezes <= viagens){
            System.out.println();
            System.out.println("Insira a quilometragem dirigida da viagem " + vezes + ": ");
            aux_quilometragem = input.nextInt();
            System.out.println("Insira a quantidade de combustivel em Litros da viagem " + vezes + ": ");
            aux_combustivel = input.nextInt();

            // relizar calculo da media
            calculo_total = aux_quilometragem / aux_combustivel;
            System.out.println("Media de consumo da viagem " + vezes + " eh: " + calculo_total + " km/L");
            
            // contabilizar dados totais
            combustivel_total += aux_combustivel;
            quilometragem_total += aux_quilometragem;
            vezes++;
        }

        // printar resultado final
        System.out.println();
        System.out.println("--- Dados Totais ---");
        System.out.println("Quilometragem: " + quilometragem_total + " km");
        System.out.println("Combustivel: " + combustivel_total + " L");
        calculo_total = quilometragem_total / combustivel_total;
        System.out.println("Media de Consumo Total: " + calculo_total + " km/L");
    }
}