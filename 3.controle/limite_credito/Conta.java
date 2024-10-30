public class Conta{

    // atributos
    private int numero_conta, saldo_inicio, itens_cobrados, creditos_aplicados, limite_credito;

    // metodos
    public Conta(int numero, int saldo, int itens, int creditos, int limite){ // construtor
        this.numero_conta = numero;
        this.saldo_inicio = saldo;
        this.itens_cobrados = itens;
        this.creditos_aplicados = creditos;
        this.limite_credito = limite;
    }

    public void setNumero(int numero){ // setter
        this.numero_conta = numero;
    }

    public int getNumero(){ // getter
        return this.numero_conta;
    }

    public void setSaldo(int saldo){ // setter
        this.saldo_inicio = saldo;
    }

    public int getSaldo(){ // getter
        return this.saldo_inicio;
    }

    public void setItens(int itens){ // setter
        this.itens_cobrados = itens;
    }

    public int getItens(){ // getter
        return this.itens_cobrados;
    }

    public void setCreditos(int creditos){ // setter
        this.creditos_aplicados = creditos;
    }

    public int getCreditos(){ // getter
        return this.creditos_aplicados;
    }

    public void setLimite(int limite){ // setter
        this.limite_credito = limite;
    }

    public int getLimite(){ // getter
        return this.limite_credito;
    }

    public void calcularNovoSaldo(){
        int novo_saldo = (this.saldo_inicio + this.itens_cobrados) - this.creditos_aplicados;
        System.out.println("Novo saldo: R$ " + novo_saldo);

        if (novo_saldo > limite_credito){
            System.out.println("Limite de credito excedido!");
        } else {
            System.out.println("Limite de credito ok!");
        }
    }

}