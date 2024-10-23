public class ContaSalario extends ContaBancaria{
    
    // atributos
    private static int count = 0;

    // metodos
    public ContaSalario(int num, double saldo, Pessoa cliente){ // construtor
        super(num, saldo, cliente); // construtor da classe mae
        ++count;
    }

    public static int getCount(){ // getter para a contagem de contas salario
        return count;
    }
}
