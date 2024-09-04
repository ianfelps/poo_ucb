/*
(Impondo privacidade com criptografia) O crescimento explosivo de comunicação e armazenamento de dados na internet e em computadores conectados por ela aumentou muito a preocupação com a privacidade. O campo da criptografia envolve a codificação de dados para torná-los difíceis de acessar (e espera-se — com os esquemas mais avançados — impossíveis de acessar) para usuários sem autorização de leitura. Nesse exercício, você investigará um esquema simples para criptografar e descriptografar dados. Uma empresa que quer enviar dados pela internet pediu-lhe que escrevesse um programa que criptografe dados a fim de que eles possam ser transmitidos com maior segurança. Todos os dados são transmitidos como inteiros de quatro dígitos. Seu aplicativo deve ler um inteiro de quatro dígitos inserido pelo usuário e criptografá-lo da seguinte maneira: substitua cada dígito pelo resultado da adição de 7 ao dígito, obtendo o restante depois da divisão do novo valor por 10. Troque então o primeiro dígito pelo terceiro e o segundo dígito pelo quarto. Então, imprima o inteiro criptografado. Escreva um aplicativo separado que receba a entrada de um inteiro de quatro dígitos criptografado e o descriptografe (revertendo o esquema de criptografia) para formar o número original. [ Projeto de leitura opcional: pesquise a “criptografia de chave pública” em geral e o esquema de chave pública específica PGP (Pretty Good Privacy). Você também pode querer investigar o esquema RSA, que é amplamente usado em aplicativos robustos industriais. ]
*/

import java.util.Scanner; // importar classe Scanner

public class Criptografar{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in); // instanciar scanner

        int num, d1, d2, d3, d4;

        // coletar num de 4 digitos
        System.out.println("--- Criptografar Numeros ---");
        System.out.println("Insira um numero de 4 digitos para criptografar: ");
        num = input.nextInt();

        if (num < 10000 && num > 999){ // verificar se o num possui 4 digitos
            
            // separar digitos
            d1 = num / 1000;
            d2 = (num / 100) % 10;
            d3 = ((num / 10) % 100) % 10;
            d4 = (((num % 10000) % 1000) % 100) % 10;

            // soma 7, obtem o resto por 10, troca o 1o pelo 3o e o 2o pelo 4o)
            d1 = ((d1 + 7) % 10) * 10;
            d2 = ((d2 + 7) % 10) * 1;
            d3 = ((d3 + 7) % 10) * 1000;
            d4 = ((d4 + 7) % 10) * 100;

            // junta os digitos
            System.out.println("--- Resultado ---");
            System.out.printf("%04d", d1 + d2 + d3 + d4);

        } else {
            System.out.println("O numero inserido eh invalido!");
        }
    }
}