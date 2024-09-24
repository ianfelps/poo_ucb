import java.util.Scanner;

public class Cinema{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] lugares_vagos = {10, 2, 1, 3, 0}; // salas 1 a 5
        int sala, quantidade;

        System.out.println("--- Salas de Cinema ---");

        // a cada insercao do usuario
        while (true) {
            System.out.print("Digite o numero da sala (1 a 5, ou 0 para sair): ");
            sala = scanner.nextInt();
            
            // se o usuario digitar 0, o programa fecha
            if (sala == 0) {
                System.out.println("Saindo...");
                break;
            }

            // verificar se o usuario escolheu uma sala valida
            if (sala < 1 || sala > 5) {
                System.out.println("Numero de sala invalido. Tente novamente.");
                continue;
            }

            System.out.print("Digite a quantidade de lugares solicitados: ");
            quantidade = scanner.nextInt();

            // verificar se ha lugares validos na sala desejada
            if (quantidade <= lugares_vagos[sala - 1]) {
                // se houver, retira os lugares e informa o usuario
                lugares_vagos[sala - 1] -= quantidade;
                System.out.println("Venda realizada! Lugares restantes na sala " + sala + ": " + lugares_vagos[sala - 1]);
            } else {
                // se nao, informa o usuario
                System.out.println("Nao ha lugares suficientes disponiveis.");
            }
        }
    }
}
