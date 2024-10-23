public class ContaBancaria{

    // atributos
    protected int numConta;
    protected double saldoConta;
    protected Pessoa cliente;

    // metodos
    public ContaBancaria(int num, double saldo, Pessoa cliente){ // construtor
        this.numConta = num;
        this.saldoConta = saldo;
        this.cliente = cliente;
    }

    public void depositar(double valor) throws Exception{ // metodo de deposito
        if(valor < 0){
            throw new Exception("Valor inválido!");
        }
        this.saldoConta += valor;
    }

    public boolean sacar(double valor){ // metodo de saque
        if (valor <= this.saldoConta){
            this.saldoConta -= valor;
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo(){ // getter do saldo
        return this.saldoConta;
    }
}