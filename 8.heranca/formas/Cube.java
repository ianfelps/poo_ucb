class Cube extends Shape implements ThreeDimensionalShape { // classe concreta para Cubo
    private double side; // atributo lado

    public Cube(double side) { // construtor
        this.side = side;
    }

    @Override // sobrescreve o metodo da interface 
    public double getArea() { // metodo para calcular a area do cubo
        return 6 * side * side; // 6 x lado^2
    }

    @Override // sobrescreve o metodo da interface 
    public double getVolume() { // metodo para calcular o volume do cubo
        return side * side * side; // lado^3
    }

    @Override // sobrescreve o metodo da classe abstrata
    public String getDescription() {
        return "Cubo com lado " + side;
    }
}