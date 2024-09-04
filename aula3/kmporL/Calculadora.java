import java.util.Scanner; // importar classe Scanner

public class Calculadora{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in); // instanciar scanner

        System.out.println("--- Calculadora Km por L ---");
        System.out.println("Insira a quantidade de viagens: ");
        int viagens = input.nextInt();

        int aux_combustivel, aux_quilometragem;
        double calculo_total = 0, combustivel_total = 0, quilometragem_total = 0;
        int vezes = 1;

        while (vezes <= viagens){
            System.out.println();
            System.out.println("Insira a quilometragem dirigida da viagem " + vezes + ": ");
            aux_quilometragem = input.nextInt();
            System.out.println("Insira a quantidade de combustivel em Litros da viagem " + vezes + ": ");
            aux_combustivel = input.nextInt();

            calculo_total = aux_quilometragem / aux_combustivel;
            System.out.println("Media de consumo da viagem " + vezes + " eh: " + calculo_total + " km/L");
            
            combustivel_total += aux_combustivel;
            quilometragem_total += aux_quilometragem;
            vezes++;
        }

        System.out.println();
        System.out.println("--- Dados Totais ---");
        System.out.println("Quilometragem: " + quilometragem_total + " km");
        System.out.println("Combustivel: " + combustivel_total + " L");
        calculo_total = quilometragem_total / combustivel_total;
        System.out.println("Media de Consumo Total: " + calculo_total + " km/L");
    }
}