public class Rational {
    private int numerador;
    private int denominador;

    // construtor sem argumentos (fracao padrao 1/1)
    public Rational() {
        this(1, 1);
    }

    // construtor com argumentos que reduz a fracao ao criar o objeto
    public Rational(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        int calcularMDC = calcularMDC(numerador, denominador);
        this.numerador = numerador / calcularMDC;
        this.denominador = denominador / calcularMDC;
        if (this.denominador < 0) { // ajusta o sinal da fracao
            this.numerador = -this.numerador;
            this.denominador = -this.denominador;
        }
    }

    // metodo para calcular o MDC (maximo divisor comum)
    private int calcularMDC(int a, int b) {
        return b == 0 ? Math.abs(a) : calcularMDC(b, a % b);
    }

    // metodo estatico para somar duas fracoes
    public static Rational somar(Rational r1, Rational r2) {
        int numerador = r1.numerador * r2.denominador + r2.numerador * r1.denominador;
        int denominador = r1.denominador * r2.denominador;
        return new Rational(numerador, denominador);
    }

    // metodo estatico para subtrair duas fracoes
    public static Rational subtrair(Rational r1, Rational r2) {
        int numerador = r1.numerador * r2.denominador - r2.numerador * r1.denominador;
        int denominador = r1.denominador * r2.denominador;
        return new Rational(numerador, denominador);
    }

    // metodo estatico para multiplicar duas fracoes
    public static Rational multiplicar(Rational r1, Rational r2) {
        int numerador = r1.numerador * r2.numerador;
        int denominador = r1.denominador * r2.denominador;
        return new Rational(numerador, denominador);
    }

    // metodo estatico para dividir duas fracoes
    public static Rational dividir(Rational r1, Rational r2) {
        if (r2.numerador == 0) {
            throw new ArithmeticException("Impossivel dividir por zero!");
        }
        int numerador = r1.numerador * r2.denominador;
        int denominador = r1.denominador * r2.numerador;
        return new Rational(numerador, denominador);
    }

    // retornar a fracao no formato a/b
    public String fracao() {
        return numerador + "/" + denominador;
    }

    // retornar a fracao no formato de ponto flutuante
    public String pontoFlutuante() {
        return String.format("%.6f", (double) numerador / denominador);
    }
}