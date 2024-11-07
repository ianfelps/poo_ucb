class Square extends Shape implements TwoDimensionalShape { // classe concreta para Quadrado
    private double side; // atributo lado

    public Square(double side) { // construtor
        this.side = side;
    }

    @Override // sobrescreve o metodo da interface
    public double getArea() { // metodo para calcular a area do quadrado
        return side * side; // lado^2
    }

    @Override // sobrescreve o metodo da classe abstrata
    public String getDescription() {
        return "Quadrado com lado: " + side;
    }
}
