abstract class Mamifero extends Animal { // classe Mamifero que estende da classe Animal

    protected String corPelo; // atributo adicional da classe Mamifero

    public Mamifero(String nome, int idade, String corPelo){ // construtor
        super(nome, idade);
        this.corPelo = corPelo;
    }
}