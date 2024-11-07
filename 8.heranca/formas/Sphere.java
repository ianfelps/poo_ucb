class Sphere extends Shape implements ThreeDimensionalShape { // classe concreta para Esfera
    private double radius; // atributo raio

    public Sphere(double radius) { // construtor
        this.radius = radius;
    }

    @Override // sobrescreve o metodo da interface 
    public double getArea() { // metodo para calcular a area da esfera
        return 4 * Math.PI * radius * radius; // 4 x PI x raio^2
    }

    @Override // sobrescreve o metodo da interface 
    public double getVolume() { // metodo para calcular o volume da esfera
        return (4 / 3.0) * Math.PI * radius * radius * radius; // 4/3 x PI x raio^4
    }

    @Override // sobrescreve o metodo da classe abstrata
    public String getDescription() {
        return "Esfera com raio " + radius;
    }
}