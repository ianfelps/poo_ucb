import java.util.Scanner; // importar classe Scanner

public class Descriptografar{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in); // instanciar scanner

        int num, d1, d2, d3, d4;

        // coletar num de 4 digitos
        System.out.println("--- Descriptografar Numeros ---");
        System.out.println("Insira um numero de 4 digitos para descriptografar: ");
        num = input.nextInt();

        if (num < 10000 && num > 999){ // verificar se o num possui 4 digitos
            
            // separar digitos
            d1 = num / 1000;
            d2 = (num / 100) % 10;
            d3 = ((num / 10) % 100) % 10;
            d4 = (((num % 10000) % 1000) % 100) % 10;

            // soma 7, obtem o resto por 10, troca o 1o pelo 3o e o 2o pelo 4o)
            d1 = ((d1 - 7 + 10) % 10) * 10;
            d2 = ((d2 - 7 + 10) % 10) * 1;
            d3 = ((d3 - 7 + 10) % 10) * 1000;
            d4 = ((d4 - 7 + 10) % 10) * 100;

            // junta os digitos
            System.out.println("--- Resultado ---");
            System.out.printf("%04d", d1 + d2 + d3 + d4);

        } else {
            System.out.println("O numero inserido eh invalido!");
        }
    }
}