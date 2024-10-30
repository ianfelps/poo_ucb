public class Produto{

    // atributos
    private String nome_produto;
    private int id_produto;
    private double preco_produto;

    // metodos
    public Produto(String nome, int id, double preco){ // construtor
        this.nome_produto = nome;
        this.id_produto = id;
        this.preco_produto = preco;
    }

    public String getNome(){ // getter do nome do produto
        return this.nome_produto;
    }

    public void setNome(String nome){ // setter do nome do produto
        this.nome_produto = nome;
    }

    public int getId(){ // getter do id do produto
        return this.id_produto;
    }

    public void setId(int id){ // setter do id do produto
        this.id_produto = id;
    }

    public double getPreco(){ // getter do preco do produto
        return this.preco_produto;
    }

    public void setPreco(double preco) throws PrecoInvalidoException{ // setter do preco do produto
        if (preco <= 0){
            throw new PrecoInvalidoException("Preco de produto invalido!");
        } else {
            this.preco_produto = preco;
        }
    }
}