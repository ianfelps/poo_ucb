public class Pinguim extends Ave implements Nadador{ // classe Pinguim que estende da classe Ave e implementa a interface Nadador

    public Pinguim(String nome, int idade, double tamanhoAsa){ // construtor
        super(nome, idade, tamanhoAsa);
    }

    @Override
    public void emitirSom(){ // sobrescrever metodo da classe Animal
        System.out.println(nome + " faz: noot noot!");
    }

    @Override
    public void nadar() { // sobrescrever metodo da interface Nadador
        System.out.println(nome + " esta nadando.");
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