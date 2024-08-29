/*
Refaça os exercícios da seção anterior que utiliza a classe Scanner com a classe JOptionPane. Dica: utilize o método static parseInt da classe Integer para converter String para Int.
*/

import java.util.Scanner; // importar scanner
import javax.swing.JOptionPane; // importar JOptionPane (interface grafica)

public class TesteBanco2{ // criar classe para execucao

    public static void main(String[] args){ // metodo main (execucao)

        Scanner input = new Scanner(System.in); // declarar e instanciar Scanner

        String nome;
        double deposito;
        int opcao_menu;
        int sair = 0;

        nome = JOptionPane.showInputDialog(null, "--- Bem-vindo! ---\nQual o seu nome?");

        ContaBanco2 ContaBancaria = new ContaBanco2(nome); // declarar e instanciar a conta do banco

        while(sair != 1){
            opcao_menu = Integer.parseInt(JOptionPane.showInputDialog(null,"Olá "+ nome + ", qual operação deseja realizar?\n1 - Depositar;\n2 - Consultar Saldo;\n3- Sair."));

            switch(opcao_menu){
                case 1:
                    deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "--- Depositar ---\nInsira o valor que deseja depositar:"));
                    ContaBancaria.depositar(deposito);
                    JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "--- Consultar Saldo ---\nO seu saldo atual é de: R$ " + ContaBancaria.consultarSaldo());
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "--- Até logo! ---");
                    sair++;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida!");
                    break;
            }
        }
    }

}