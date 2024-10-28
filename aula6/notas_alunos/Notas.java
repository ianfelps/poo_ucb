import java.util.Scanner;

public class Notas{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in); // importar a classe Scanner

        double somaNotas = 0;
        int quantidadeNotas = 0;

        System.out.println("Insira as notas do aluno (-1 para finalizar): ");
        
        while (true){
            System.out.println("Nota: ");
            double nota = input.nextDouble();

            if (nota == -1){ // condicao para parar o loop
                break;
            }

            // assert para verificar
            assert nota >= 0 && nota <= 10 : "Nota invalida! A nota deve estar entre 0 e 10.";

            // se a nota eh valida
            somaNotas += nota;
            quantidadeNotas++;
        }

        if (quantidadeNotas > 0){
            double mediaNotas = somaNotas / quantidadeNotas;
            System.out.println("Media das notas: " + mediaNotas);
        } else {
            System.out.println("Nenhuma nota valida!");
        }
    }
}