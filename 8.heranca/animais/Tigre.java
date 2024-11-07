public class Tigre extends Mamifero{ // classe Tigre que estende da classe Mamifero

    public Tigre(String nome, int idade, String corPelo){ // construtor
        super(nome, idade, corPelo);
    }

    @Override
    public void emitirSom(){ // sobrescrever metodo da classe Animal
        System.out.println(nome + " faz: grrr, roar!");
    }

    // getters e setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setCorPelo(String corPelo){
        this.corPelo = corPelo;
    }

    public String getCorPelo(){
        return this.corPelo;
    }
}