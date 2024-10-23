public class ContaTeste{
    
    public static void main(String[] args){

        // declarar objetos
        Pessoa pessoa1 = new Pessoa("Joao", "123.456.789-10", 20);
        ContaBancaria conta1 = new ContaBancaria(1234, 1000, pessoa1);
        ContaSalario salario1 = new ContaSalario(1230, 10000, pessoa1);
        
        // tentativa de deposito 1
        try {
            conta1.depositar(-90);
        } catch(Exception e) {
            System.out.printf("%s%n", e.getMessage());
        }

        // tentativa de deposito 2
        try {
            conta1.depositar(150);
        } catch(Exception e) {
            System.out.printf("%s%n", e.getMessage());
        }

        // printar saldo atual
        System.out.println("O saldo da conta eh: " + conta1.getSaldo());
        
        // tentar sacar valor
        if(conta1.sacar(12000)){
            System.out.println("Valor sacado!");
        } else {
            System.out.println("Nao foi possivel sacar o valor!");
        }

        // printar saldo atual
        System.out.println("O saldo da conta eh: " + conta1.getSaldo());

        // tentar sacar da conta salario
        if(salario1.sacar(500)){
            System.out.println("Valor sacado da conta salario!");
        } else{
            System.out.println("Nao foi possivel sacar o valor da conta salario!");
        }

        // printar saldo atual da conta salario
        System.out.println("O saldo da conta salario eh: " + salario1.getSaldo());

        // criar outra conta salario
        ContaSalario salario2 = new ContaSalario(1240, 15000, null);
        System.out.println("O total de contas salario eh: " + ContaSalario.getCount());
        

    }
}
