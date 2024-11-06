public class Pessoa{
    
    // atributos
    protected String nomePessoa;
    protected String cpfPessoa;
    protected int idadePessoa;

    // metodos
    public Pessoa(String nome, String cpf, int idade){ // construtor
        this.nomePessoa = nome;
        this.cpfPessoa = cpf;
        this.idadePessoa = idade;
    }
}