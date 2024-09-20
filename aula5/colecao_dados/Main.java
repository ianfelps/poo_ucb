public class Main{

    public static void main(String[] args){

        // colecao de dados
        int[] dados = {12, -2, 4, 8, 29, 45, 78, 36, -17, 2, 12, 8, 3, 3, -52};

        // chamada das funcoes
        System.out.printf("Colecao de dados: ");
        Colecao.imprimirColecao(dados); // todos os dados

        // maior e menor elemento da colecao
        System.out.println("Maior elemento: " + Colecao.encontrarMaior(dados));
        System.out.println("Menor elemento: " + Colecao.encontrarMenor(dados));

        // numeros pares
        System.out.printf("Numeros pares: ");
        Colecao.imprimirPares(dados);

        // numero de ocorrencias de um elemento
        System.out.println("Numero de ocorrencias do elemento (" + dados[0] + "): " + Colecao.numeroOcorrencias(dados, dados[0]));

        // media dos elementos
        System.out.println("Media dos elementos: " + Colecao.mediaElementos(dados));

        // soma dos elementos negativos
        System.out.println("Soma dos elementos negativos: " + Colecao.somaElementosNegativos(dados));
    }
}