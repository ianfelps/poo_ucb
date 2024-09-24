public class Calculos{

    // calcular a media
    public static double calcularMedia(double[] numeros) {
        double soma = 0;
        for (double num : numeros) {
            soma += num;
        }
        return soma / numeros.length;
    }

    // calcular o desvio padrao
    public static double calcularDesvioPadrao(double[] numeros, double media) {
        double somaQuadrados = 0;
        for (double num : numeros) {
            somaQuadrados += Math.pow(num - media, 2);
        }
        return Math.sqrt(somaQuadrados / (numeros.length - 1));
    }
}
