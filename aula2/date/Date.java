public class Date{

    // atributos da classe
    private int dia;
    private int mes;
    private int ano;

    // metodos da classe
    public Date(int num1, int num2, int num3){ // construtor
        this.dia = num1;
        this.mes = num2;
        this.ano = num3;
    }

    public void setDia(int num1){ // setter dia
        this.dia = num1;
    }

    public int getDia(){ // getter dia
        return this.dia;
    }

    public void setMes(int num1){ // setter mes
        this.mes = num1;
    }

    public int getMes(){ // getter mes
        return this.mes;
    }

    public void setAno(int num1){ // setter ano
        this.ano = num1;
    }

    public int getAno(){ // getter ano
        return this.ano;
    }

    public void displayDate(){
        System.out.println("Data: " + getDia() + "/" + getMes() + "/" + getAno());
    }



}