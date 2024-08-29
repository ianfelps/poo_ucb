/*
Crie um aplicativo que mantém o saldo de uma conta bancária, realiza depósito e mostra o saldo da conta. Realize depósitos e apresente ao usuário seu saldo. Dica: utilize o método nextDouble da classe Scanner.
*/

import java.util.Scanner; // importar scanner

public class TesteBanco{ // criar classe para execucao

    public static void main(String[] args){ // metodo main (execucao)

        Scanner input = new Scanner(System.in); // declarar e instanciar Scanner

        String nome;
        double deposito;
        int opcao_menu;
        int sair = 0;

        System.out.println("--- Conta Bancaria ---");

        System.out.println("Qual o seu nome? ");
        nome = input.nextLine();

        ContaBanco ContaBancaria = new ContaBanco(nome); // declarar e instanciar a conta do banco

        while(sair != 1){
            System.out.printf("\nOlá %s, qual operacao deseja realizar? \n", nome);
            System.out.println("1 - Depositar;");
            System.out.println("2 - Consultar Saldo;");
            System.out.println("3 - Sair.");
            opcao_menu = input.nextInt();

            switch(opcao_menu){
                case 1:
                    System.out.println("--- Depositar ---");
                    System.out.println("Insira o valor que deseja depositar: ");
                    deposito = input.nextDouble();
                    ContaBancaria.depositar(deposito);
                    System.out.println("Deposito realizado com sucesso!");
                    break;

                case 2:
                    System.out.println("--- Consultar Saldo ---");
                    System.out.printf("O seu saldo atual eh de: R$ %.2f\n", ContaBancaria.consultarSaldo());
                    break;

                case 3:
                    System.out.println("--- Ate logo! ---");
                    sair++;
                    break;

                default:
                    System.out.println("Opcao Invalida!");
                    break;
            }
        }
    }

}