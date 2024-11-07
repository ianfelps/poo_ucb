abstract class Animal { // criar classe abstrata

    protected String nome;
    protected int idade;

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void emitirSom();
}