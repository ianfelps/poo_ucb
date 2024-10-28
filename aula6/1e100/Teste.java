import java.util.Scanner;

public class Teste{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in); // importar a classe Scanner
        Verificacao verificacao = new Verificacao(); // importar a classe Verificacao

        // coletar numero
        System.out.println("Insira um numero para realizar a verificacao: ");
        int numero = input.nextInt();

        // tentar o metodo
        try {
            verificacao.verificarNumero(numero);
        } catch (NumeroInvalidoException e){
            System.out.println(e.getMessage());
        }
    }
}