/*
Desenvolva um aplicativo Java que determina se um cliente de uma loja de departamentos excedeu o limite de crédito em uma conta-corrente. Para cada cliente, os seguintes dados estão disponíveis:
a) Número de conta.
b) Saldo no início do mês.
c) Total de todos os itens cobrados desse cliente no mês.
d) Total de créditos aplicados ao cliente no mês.
e) Limite de crédito autorizado.
O programa deve inserir todos esses dados como inteiros, calcular o novo saldo (= saldo inicial + despesas – créditos), exibir o novo saldo e determinar se o novo saldo excede ao limite de crédito do cliente. Para aqueles clientes cujo limite de crédito foi excedido, o programa deve exibir a mensagem "Limite de crédito excedido".
*/

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Conta contaAtual = new Conta(1, 2, 3, 4, 5); // instanciar conta com valores inicias

        // coletar, armazenar e setar novos dados
        System.out.println("--- Calcular Limite de Credito ---");

        System.out.println("Insira o numero da conta: ");
        int numero = input.nextInt();
        contaAtual.setNumero(numero); // setar valores novos

        System.out.println("Insira o saldo do inicio do mes: ");
        int saldo = input.nextInt();
        contaAtual.setSaldo(saldo); // setar valores novos

        System.out.println("Insira o total de itens cobrados: ");
        int itens = input.nextInt();
        contaAtual.setItens(itens); // setar valores novos

        System.out.println("Insira o total de creditos aplicados");
        int creditos = input.nextInt();
        contaAtual.setCreditos(creditos); // setar valores novos

        System.out.println("Insira o limite de credito da conta: ");
        int limite = input.nextInt();
        contaAtual.setLimite(limite); // setar valores novos

        // calcular
        System.out.println("--- Resultado ---");
        System.out.println("Num. da Conta: " + contaAtual.getNumero());
        System.out.println("Saldo Inicial: R$ " + contaAtual.getSaldo());
        System.out.println("Itens Cobrados: R$ " + contaAtual.getItens());
        System.out.println("Creditos Aplicados: R$ " + contaAtual.getCreditos());
        System.out.println("Limite de Credito: R$ " + contaAtual.getLimite());
        System.out.println();
        System.out.println("Novo Saldo = Saldo Inicial + Itens Cobrados - Creditos Aplicados");
        contaAtual.calcularNovoSaldo();

    }
}