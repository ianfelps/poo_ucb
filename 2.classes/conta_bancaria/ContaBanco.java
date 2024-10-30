public class ContaBanco{ // criar classe da conta do banco

    // atributos
    private String nome_cliente;
    private int numero_conta;
    private double saldo_total, limite_total;

    // metodos
    public ContaBanco(String nome, int numero, double limite){ // construtor
        this.nome_cliente = nome;
        this.numero_conta = numero;
        this.limite_total = limite;
    }

    public void setNome(String nome){ // setter
        this.nome_cliente = nome;
    }

    public String getNome(){ // getter
        return this.nome_cliente;
    }

    public void setNumero(int numero){ // setter
        this.numero_conta = numero;
    }

    public int getNumero(){ // getter
        return this.numero_conta;
    }

    public void setLimite(double limite){ // setter
        this.limite_total = limite;
    }

    public double getLimite(){ // getter
        return this.limite_total;
    }

    public void depositar(double valor){ // setter
        this.saldo_total += valor;
    }

    public void sacar(double valor){
        if(valor < this.limite_total && valor < this.saldo_total){
            this.saldo_total -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Impossivel realizar saque!");
        }
    }

    public double consultarSaldo(){ // getter
        return this.saldo_total;
    }

}