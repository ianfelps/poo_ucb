public class Cadastro{

    public static void main(String[] args) {
        try {
            Pessoa cliente = new Pessoa("João", 19); // Deve lançar a exceção
            System.out.printf("Cliente: %s | Idade: %d%n", cliente.getNome(), cliente.getIdade());
        } catch (InvalidAgeException e) {
            System.out.println("Erro ao cadastrar cliente: " + e.getMessage());
        }
    }
}