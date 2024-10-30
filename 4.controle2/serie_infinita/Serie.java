// Calcule o valor de Pi a partir de uma série infinita. Imprima uma tabela que mostre o valor aproximado de Pi calculando os 200.000 primeiros termos dessa série. Quantos termos você tem de utilizar antes de primeiro obter um valor que começa com 3,14159?

public class Serie{

    public static void main(String[] args){

        double pi = 0.0;
        int numero_termos = 0;
        double alvo = 3.14159;

        System.out.printf("Termo \t Aproximacao \n"); // cabecalho da tabela

        // inicia o loop para calcular os primeiros 200000 termos
        for (int i = 0; i < 200000; i++){
            // formula para calcular a serie infinita
            if (i % 2 == 0){
                pi += 4.0 / (2 * i + 1);
            } else {
                pi -= 4.0 / (2 * i + 1);
            }
            // printa os valores de 5000 em 5000
            if (i % 5000 == 0){
                System.out.printf("%d \t %f \n", i, pi);
            }
            // verifica se a diferença entre pi e o valor alvo é menor que uma pequena tolerância
            if (Math.abs(pi - alvo) < 0.00001){
                numero_termos = i;
                break;
            }
        }

        // printa o resultado
        System.out.println("--- Resultado ---");
        System.out.printf("O valor de Pi (%.5f) foi encontrado em %d termos!", alvo, numero_termos);
    }
}