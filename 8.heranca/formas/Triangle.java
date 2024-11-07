class Triangle extends Shape implements TwoDimensionalShape { // classe concreta para Triangulo
    private double base;  // atributo base
    private double height; // atributo altura

    public Triangle(double base, double height) { // construtor
        this.base = base;
        this.height = height;
    }

    @Override // sobrescreve o metodo da interface 
    public double getArea() { // metodo para calcular a area do triangulo
        return (base * height) / 2; // (base x alutra) / 2
    }

    @Override // sobrescreve o metodo da classe abstrata
    public String getDescription() {
        return "Triangulo com base " + base + " e altura " + height;
    }
}