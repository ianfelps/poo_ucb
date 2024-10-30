public class Date {
    private int dia;
    private int mes;
    private int ano;

    // construtor para o formato MM/DD/YYYY
    public Date(int mes, int dia, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // construtor para o formato "Dia de Mes, Ano" (ex: "14 de Junho, 1992")
    public Date(String nomeMes, int dia, int ano) {
        this.mes = pegarNumeroMes(nomeMes);
        this.dia = dia;
        this.ano = ano;
    }

    // construtor para o formato "DDD YYYY" (ex: dia 165 do ano 1992)
    public Date(int diaAno, int ano) {
        this.ano = ano;
        int[] diasMes = { 31, verificarBissexto(ano) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        this.mes = 1;
        this.dia = diaAno;

        // ajuste para calcular o mes e o dia com base no dia do ano
        for (int i = 0; i < 12; i++) {
            if (diaAno > diasMes[i]) {
                diaAno -= diasMes[i];
                this.mes++;
            } else {
                this.dia = diaAno;
                break;
            }
        }
    }

    // metodo para verificar se o ano é bissexto
    private static boolean verificarBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    // metodo auxiliar para converter o nome do mes em numero do mes
    private int pegarNumeroMes(String nomeMes) {
        String[] meses = {
            "Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        
        for (int i = 0; i < meses.length; i++) {
            if (meses[i].equalsIgnoreCase(nomeMes)) {
                return i + 1;
            }
        }
        throw new IllegalArgumentException("Nome do mes inválido: " + nomeMes);
    }

    // metodo para exibir a data no formato MM/DD/YYYY
    public String formatarMMDDYYYY() {
        return (mes < 10 ? "0" : "") + mes + "/" + 
               (dia < 10 ? "0" : "") + dia + "/" + ano;
    }

    // metodo para exibir a data no formato "Dia de Mes, Ano"
    public String formatarDiaMesAno() {
        String[] meses = {
            "Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        return dia + " de " + meses[mes - 1] + ", " + ano;
    }

    // metodo para exibir a data no formato "DDD YYYY"
    public String formatarDiaDoAno() {
        int diaAno = dia;
        int[] diasMes = { 31, verificarBissexto(ano) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        for (int i = 0; i < mes - 1; i++) {
            diaAno += diasMes[i];
        }
        return diaAno + " " + ano;
    }
}