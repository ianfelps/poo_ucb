public class Complex {
    private double parteReal;
    private double parteImaginaria;

    // construtor sem argumentos
    public Complex() {
        this.parteReal = 0.0;
        this.parteImaginaria = 0.0;
    }

    // construtor com argumentos
    public Complex(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    // metodo para somar dois numeros complexos
    public Complex somar(Complex outro) {
        double novaParteReal = this.parteReal + outro.parteReal;
        double novaParteImaginaria = this.parteImaginaria + outro.parteImaginaria;
        return new Complex(novaParteReal, novaParteImaginaria);
    }

    // metodo para subtrair dois numeros complexos
    public Complex subtrair(Complex outro) {
        double novaParteReal = this.parteReal - outro.parteReal;
        double novaParteImaginaria = this.parteImaginaria - outro.parteImaginaria;
        return new Complex(novaParteReal, novaParteImaginaria);
    }

    // metodo para imprimir o numero complexo
    public void imprimir() {
        System.out.println("(" + parteReal + ", " + parteImaginaria + ")");
    }
}
