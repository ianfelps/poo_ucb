/*
Crie um aplicativo que mantém o saldo de uma conta bancária, realiza depósito e mostra o saldo da conta. Realize depósitos e apresente ao usuário seu saldo. Dica: utilize o método nextDouble da classe Scanner.
*/

import java.util.Scanner; // importar scanner

public class TesteBanco{ // criar classe para execucao

    public static void main(String[] args){ // metodo main (execucao)

        Scanner input = new Scanner(System.in); // declarar e instanciar Scanner

        double deposito, saque;
        int opcao_menu = 0;

        System.out.println("--- Conta Bancaria ---");

        System.out.println("Insira o seu nome: ");
        String nome = input.nextLine();
        System.out.println("Insira o numero da conta: ");
        int numero = input.nextInt();

        ContaBanco ContaBancaria = new ContaBanco(nome, numero, 500); // declarar e instanciar a conta do banco

        while(opcao_menu != 5){
            System.out.println();
            System.out.println("Ola " + ContaBancaria.getNome() + ", qual operacao deseja realizar?");
            System.out.println("1 - Depositar;");
            System.out.println("2 - Sacar;");
            System.out.println("3 - Consultar Saldo;");
            System.out.println("4 - Consultar Dados;");
            System.out.println("5 - Sair.");
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
                    System.out.println("--- Sacar ---");
                    System.out.println("Insira o valor que deseja sacar: ");
                    saque = input.nextDouble();
                    ContaBancaria.sacar(saque);
                    break;

                case 3:
                    System.out.println("--- Consultar Saldo ---");
                    System.out.printf("O seu saldo atual eh de: R$ %.2f\n", ContaBancaria.consultarSaldo());
                    break;

                case 4:
                    System.out.println("--- Consultar Dados ---");
                    System.out.println("Nome: " + ContaBancaria.getNome());
                    System.out.println("Num. Conta: " + ContaBancaria.getNumero());
                    System.out.println("Limite: R$ " + ContaBancaria.getLimite());
                    break;

                case 5:
                    System.out.println("--- Ate logo! ---");
                    break;

                default:
                    System.out.println("Opcao Invalida!");
                    break;
            }
        }
    }

}