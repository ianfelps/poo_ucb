public class Main {
    public static void main(String[] args) {
        Date data1 = new Date(6, 14, 1992); // MM/DD/YYYY
        Date data2 = new Date("Junho", 14, 1992); // "Dia de Mes, Ano"
        Date data3 = new Date(165, 1992); // DDD YYYY

        System.out.println("Formato MM/DD/YYYY: " + data1.formatarMMDDYYYY());
        System.out.println("Formato Dia de Mes, Ano: " + data2.formatarDiaMesAno());
        System.out.println("Formato DDD YYYY: " + data3.formatarDiaDoAno());
    }
}
