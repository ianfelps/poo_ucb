import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o numerador da primeira fracao: ");
        int n1 = input.nextInt();
        System.out.print("Digite o denominador da primeira fracao: ");
        int n2 = input.nextInt();

        System.out.print("Digite o numerador da segunda fracao: ");
        int n3 = input.nextInt();
        System.out.print("Digite o denominador da segunda fracao: ");
        int n4 = input.nextInt();

        Rational r1 = new Rational(n1, n2);
        Rational r2 = new Rational(n3, n4);

        // somar
        Rational soma = Rational.somar(r1, r2);
        System.out.println("Soma: " + soma.fracao() + " ou " + soma.pontoFlutuante());

        // subtrair
        Rational subtracao = Rational.subtrair(r1, r2);
        System.out.println("Subtracao: " + subtracao.fracao() + " ou " + subtracao.pontoFlutuante());

        // multiplicar
        Rational multiplicacao = Rational.multiplicar(r1, r2);
        System.out.println("Multiplicacao: " + multiplicacao.fracao() + " ou " + multiplicacao.pontoFlutuante());

        // dividir
        Rational divisao = Rational.dividir(r1, r2);
        System.out.println("Divisao: " + divisao.fracao() + " ou " + divisao.pontoFlutuante());
    }
}
