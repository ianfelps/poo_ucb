class Circle extends Shape implements TwoDimensionalShape { // classe concreta para Circulo
    private double radius; // atributo raio

    public Circle(double radius) { // construtor
        this.radius = radius;
    }

    @Override // sobrescreve o metodo da interface
    public double getArea() { // metodo para calcular a area do circulo
        return Math.PI * radius * radius; // PI x raio^2
    }

    @Override // sobrescreve o metodo da classe abstrata
    public String getDescription() {
        return "Circulo com raio: " + radius;
    }
}
