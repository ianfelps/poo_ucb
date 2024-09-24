import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parenteses validador = new Parenteses();  // instancia a classe Parenteses

        System.out.println("--- Verificar Parenteses ---");

        System.out.println("Digite uma expressão com parênteses: ");
        String expressao = scanner.nextLine();

        // utiliza o funcao de verificacao
        if (validador.verificaExpressao(expressao)) {
            System.out.println("OK");
        } else {
            System.out.println("Erro");
        }

        scanner.close();
    }
}
