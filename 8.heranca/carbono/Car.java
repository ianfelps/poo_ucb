public class Car implements CarbonFootprint { // classe Car com atributos e calculo da pegada de carbono
    private double fuelConsumption; // consumo de combustivel anual em litros
    private double emissionFactor;  // fator de emissao em kg CO2 por litro de combustivel

    public Car(double fuelConsumption, double emissionFactor) { // construtor
        this.fuelConsumption = fuelConsumption;
        this.emissionFactor = emissionFactor;
    }

    @Override // sobrescreve o metodo da interface
    public double getCarbonFootprint() {
        return fuelConsumption * emissionFactor; // calculo de pegada de carbono
    }

    @Override // sobrescreve o metodo da interface
    public void printInfo() {
        System.out.printf("Car [Consumo de Combustível: %.2f litros, Fator de Emissão: %.3f kg CO2/litro]\n", fuelConsumption, emissionFactor);
        System.out.printf("Pegada de Carbono: %.2f kg CO2\n\n", getCarbonFootprint());
    }
}
