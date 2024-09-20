public class Verificacao{

    // verificar se o numero já existe no array
    public static boolean existeNoArray(int[] array, int tamanho, int numero) {
        for (int i = 0; i < tamanho; i++) {
            if (array[i] == numero) {
                return true; // o numero ja existe no array
            }
        }
        return false; // O numero ainda nao foi inserido
    }

    // obter numeros unicos de um array de entrada
    public static int[] obterNumerosUnicos(int[] numeros) {
        int[] numerosUnicos = new int[numeros.length];
        int count = 0;

        // verificar duplicatas e armazenar apenas numeros unicos
        for (int i = 0; i < numeros.length; i++) {
            if (!existeNoArray(numerosUnicos, count, numeros[i])) {
                numerosUnicos[count] = numeros[i];
                count++;
            }
        }

        // retornar apenas os elementos únicos no array
        int[] resultado = new int[count];
        System.arraycopy(numerosUnicos, 0, resultado, 0, count);
        return resultado;
    }
}
