public class Aguia extends Ave implements Voador{ // classe Aguia que estende da classe Ave e implementa a interface Voador

    public Aguia(String nome, int idade, double tamanhoAsa){ // construtor
        super(nome, idade, tamanhoAsa);
    }

    @Override
    public void emitirSom(){ // sobrescrever metodo da classe Animal
        System.out.println(nome + " faz: croac croac, cuá!");
    }

    @Override
    public void voar() { // sobrescrever metodo da interface Voador
        System.out.println(nome + " esta voando.");
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

    public void setTamanhoAsa(double tamanhoAsa){
        this.tamanhoAsa = tamanhoAsa;
    }

    public double getTamanhoAsa(){
        return this.tamanhoAsa;
    }
}