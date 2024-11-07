abstract class Ave extends Animal { // classe Ave que estende de Animal

    protected double tamanhoAsa; // atributo adicional da classe Ave

    public Ave(String nome, int idade, double tamanhoAsa){ // construtor
        super(nome, idade);
        this.tamanhoAsa = tamanhoAsa;
    }
}