public class Elefante extends Mamifero{ // classe Elefante que estende da classe Mamifero

    public Elefante(String nome, int idade, String corPelo){ // construtor
        super(nome, idade, corPelo);
    }

    @Override
    public void emitirSom(){ // sobrescrever metodo da classe Animal
        System.out.println(nome + " faz: fuumm uuuuh!");
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