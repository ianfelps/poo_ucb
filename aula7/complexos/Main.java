import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // entrada para o primeiro numero complexo
        System.out.print("Digite a parte real do primeiro numero complexo: ");
        double real1 = input.nextDouble();
        System.out.print("Digite a parte imaginaria do primeiro numero complexo: ");
        double imag1 = input.nextDouble();
        Complex numero1 = new Complex(real1, imag1);

        // entrada para o segundo numero complexo
        System.out.print("Digite a parte real do segundo numero complexo: ");
        double real2 = input.nextDouble();
        System.out.print("Digite a parte imaginaria do segundo numero complexo: ");
        double imag2 = input.nextDouble();
        Complex numero2 = new Complex(real2, imag2);

        // realizando as operacoes
        Complex soma = numero1.somar(numero2);
        Complex subtracao = numero1.subtrair(numero2);

        // exibindo os resultados
        System.out.print("Numero 1: ");
        numero1.imprimir();
        System.out.print("Numero 2: ");
        numero2.imprimir();
        System.out.print("Soma: ");
        soma.imprimir();
        System.out.print("Subtracao: ");
        subtracao.imprimir();
    }
}