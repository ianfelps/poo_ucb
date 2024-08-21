import java.util.Scanner; // importar Scanner

public class Paridade{ // cirar classe

    public static void main(String[] args){ // criar funcao main

        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("Entre com um numero: ");
        num = input.nextInt();

        // operacao if
        if (num % 2 == 0){
            System.out.printf("O numero %d eh par!", num);
        } else {
            System.out.printf("O numero %d eh impar!", num);
        }
    }

}