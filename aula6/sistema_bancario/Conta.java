public class Conta{

    // atributos
    private int numero_conta;
    private double saldo_total;

    // metodos
    public Conta(int numero, double saldo){ // construtor
        this.numero_conta = numero;
        this.saldo_total = saldo;
    }

    public int getNumero(){ // getter do numero da conta
        return this.numero_conta;
    }

    public double consultarSaldo(){ // getter do saldo total
        return this.saldo_total;
    }

    public void depositar(double valor){ // funcao para depositar um valor
        if (valor > 0){
            this.saldo_total += valor;
            System.out.println("Deposito realizado com sucesso! Saldo atual: R$ " + saldo_total);
        } else {
            System.out.println("Valor de deposito invalido!");
        }
    }

    public void sacar(double valor) throws SaldoInsuficienteException{ // funcao para sacar um valor
        if (valor > saldo_total){
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque!");
        } else if (valor > 0){
            this.saldo_total -= valor;
            System.out.println("Saque realizado com sucesso! Saldo atual: R$ " + saldo_total);
        } else {
            System.out.println("Valor de saque invalido!");
        }
    }
}