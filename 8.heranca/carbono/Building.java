public class Building implements CarbonFootprint { // classe Building com atributos e calculo da pegada de carbono
    private double energyConsumption; // consumo de energia anual em kWh
    private double emissionFactor;    // fator de emissao em kg CO2 por kWh

    public Building(double energyConsumption, double emissionFactor) { // construtor
        this.energyConsumption = energyConsumption;
        this.emissionFactor = emissionFactor;
    }

    @Override // sobrescreve o metodo da interface
    public double getCarbonFootprint() {
        return energyConsumption * emissionFactor; // calculo de pegada de carbono
    }

    @Override // sobrescreve o metodo da interface
    public void printInfo() {
        System.out.printf("Building [Consumo de Energia: %.2f kWh, Fator de Emissão: %.3f kg CO2/kWh]\n", energyConsumption, emissionFactor);
        System.out.printf("Pegada de Carbono: %.2f kg CO2\n\n", getCarbonFootprint());
    }
}
