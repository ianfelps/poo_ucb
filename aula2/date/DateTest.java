import java.util.Scanner; // importar scanner

public class DateTest{ // classe de teste

    public static void main(String[] args){ // metodo main

        Scanner input = new Scanner(System.in); // declarar e instanciar Scanner

        Date minhaData = new Date(1,1,2000); // declarar e instanciar Date

        // atributos iniciais
        System.out.println("--- Atributos Iniciais ---");
        minhaData.displayDate();

        // coletar dados e alterar atributos
        System.out.println("Insira o dia: ");
        int dia = input.nextInt();

        System.out.println("Insira o mes: ");
        int mes = input.nextInt();

        System.out.println("Insira o ano: ");
        int ano = input.nextInt();

        // alterar/atualizar atributos com os setters
        minhaData.setDia(dia);
        minhaData.setMes(mes);
        minhaData.setAno(ano);

        // atributos após alterações
        System.out.println("--- Atributos apos Alteracoes ---");
        minhaData.displayDate();

    }

}