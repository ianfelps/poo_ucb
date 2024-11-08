public class Bicycle implements CarbonFootprint { // classe Bicycle com atributos e calculo da pegada de carbono
    private double distanceTraveled; // distancia anual percorrida em km
    private double emissionFactor;   // fator de emissao em kg CO2 por km

    public Bicycle(double distanceTraveled, double emissionFactor) { // construtor
        this.distanceTraveled = distanceTraveled;
        this.emissionFactor = emissionFactor;
    }

    @Override // sobrescreve o metodo da interface
    public double getCarbonFootprint() {
        return distanceTraveled * emissionFactor; // calculo de pegada de carbono (geralmente zero)
    }

    @Override // sobrescreve o metodo da interface
    public void printInfo() {
        System.out.printf("Bicycle [Distância Percorrida: %.2f km, Fator de Emissão: %.3f kg CO2/km]\n", distanceTraveled, emissionFactor);
        System.out.printf("Pegada de Carbono: %.2f kg CO2\n\n", getCarbonFootprint());
    }
}
