import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in); // instanciar scanner

        Juros calculoAtual = new Juros(); // instanciar classe Juros

        System.out.println("--- Calculadora de Juros ---");

        // coletar e atribuir valores
        System.out.println("Insira a quantia original investida:");
        double quantia = input.nextDouble();
        calculoAtual.setQuantiaOriginal(quantia);

        System.out.println("Insira a taxa de juros anual em %:");
        double taxa = input.nextDouble();
        calculoAtual.setTaxaAnual(taxa);

        System.out.println("Insira o numero de anos:");
        int anos = input.nextInt();
        calculoAtual.setNumeroAnos(anos);

        // exibir resultado
        System.out.println("--- Resultado ---");
        System.out.printf("A quantia em deposito eh: US$ %.2f", calculoAtual.calcularQuantiaDeposito());
    }
}