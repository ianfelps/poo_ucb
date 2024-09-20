public class Colecao{

    // printar colecao
    public static void imprimirColecao(int[] array){
        for (int num : array){
            System.out.printf("%d ", num);
        }
        System.out.println("");
    }

    // retornar maior elemento
    public static int encontrarMaior(int[] array){
        int maior = 0;
        for (int num : array){
            if (num > maior){
                maior = num;
            }
        }
        return maior;
    }

    // retornar menor elemento
    public static int encontrarMenor(int[] array){
        int menor = 0;
        for (int num : array){
            if (num < menor){
                menor = num;
            }
        }
        return menor;
    }

    // retronar numeros pares
    public static void imprimirPares(int[] array){
        for (int num : array){
            if (num % 2 == 0){
                System.out.printf("%d ", num);
            }
        }
        System.out.println("");
    }

    // retornar numero de ocorrencias do primeiro elemento da lista
    public static int numeroOcorrencias(int[] array, int elemento){
        int contador = 0;
        for (int num : array){
            if (num == elemento){
                contador++;
            }
        }
        return contador;
    }

    // retornar media dos elementos
    public static double mediaElementos(int[] array){
        double media = 0;
        for (int num : array){
            media += num;
        }
        return media / array.length;
    }

    // retornar soma dos elementos de valor negativo
    public static int somaElementosNegativos(int[] array){
        int soma = 0;
        for (int num : array){
            if (num < 0){
                soma += num;
            }
        }
        return soma;
    }
}