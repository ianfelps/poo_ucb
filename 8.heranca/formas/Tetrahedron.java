class Tetrahedron extends Shape implements ThreeDimensionalShape { // classe concreta para Tetraedro
    private double side; // atributo lado

    public Tetrahedron(double side) { // construtor
        this.side = side;
    }

    @Override // sobrescreve o metodo da interface 
    public double getArea() { // metodo para calcular a area do tetraedro
        return Math.sqrt(3) * side * side; // raiz de 3 x lado^2
    }

    @Override // sobrescreve o metodo da interface 
    public double getVolume() { // metodo para calcular o volume do tetraedro
        return Math.pow(side, 3) / (6 * Math.sqrt(2)); // lado^3 / 6 x raiz de 2
    }

    @Override // sobrescreve o metodo da classe abstrata
    public String getDescription() {
        return "Tetraedro com lado " + side;
    }
}