public class ContaBanco2{ // criar classe da conta do banco

    // atributos
    private String nome_cliente;
    private double saldo_total;

    // metodos
    public ContaBanco2(String nome){ // construtor
        this.nome_cliente = nome;
    }

    public void depositar(double valor){ // setter
        this.saldo_total += valor;
    }

    public double consultarSaldo(){ // getter
        return this.saldo_total;
    }

}