public class Fatorial {

    // metodo recursivo para calcular o fatorial
    public static int calcularFatorial(int numero) throws NegativeNumberException {
        if (numero < 0) {
            throw new NegativeNumberException("Nao eh possível calcular o fatorial de um numero negativo: " + numero);
        } else if (numero == 0 || numero == 1) {
            return 1; // fatorial de 0 e 1 é 1
        } else {
            return numero * calcularFatorial(numero - 1); // recursividade
        }
    }

    public static void main(String[] args) {
        try {
            int numero = 5;
            int resultado = calcularFatorial(numero);
            System.out.println("Fatorial de " + numero + " eh: " + resultado);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}