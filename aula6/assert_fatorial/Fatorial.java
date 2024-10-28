import java.util.Scanner;

public class Fatorial{

    // metodo recursivo para calcular o fatorial
    public static int calcularFatorial(int numero){
        if (numero < 0) {
            return 0;
        } else if (numero == 0 || numero == 1) {
            return 1; // fatorial de 0 e 1 é 1
        } else {
            return numero * calcularFatorial(numero - 1); // recursividade
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira um numero para calcular o seu fatorial: ");
        int numero = input.nextInt();

        assert numero >= 0 : "Numero invalido! O numero precisa ser positivo!";

        int resultado = calcularFatorial(numero);
        System.out.println("Fatorial de " + numero + " eh: " + resultado);
    }
}