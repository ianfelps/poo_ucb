import java.util.Scanner;

public class Cinema{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] lugares_vagos = {10, 2, 1, 3, 0}; // Salas 1 a 5
        int sala, quantidade;

        while (true) {
            System.out.print("Digite o número da sala (1 a 5, ou 0 para sair): ");
            sala = scanner.nextInt();
            
            if (sala == 0) {
                System.out.println("Saindo...");
                break;
            }

            if (sala < 1 || sala > 5) {
                System.out.println("Número de sala inválido. Tente novamente.");
                continue;
            }

            System.out.print("Digite a quantidade de lugares solicitados: ");
            quantidade = scanner.nextInt();

            if (quantidade <= lugares_vagos[sala - 1]) {
                lugares_vagos[sala - 1] -= quantidade;
                System.out.println("Venda realizada! Lugares restantes na sala " + sala + ": " + lugares_vagos[sala - 1]);
            } else {
                System.out.println("Não há lugares suficientes disponíveis.");
            }
        }

        scanner.close();
    }
}
