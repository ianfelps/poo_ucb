import java.util.ArrayList;
import java.util.List;

public class Main { // classe para execucao e testes
    public static void main(String[] args) {
        // criar objetos para cada classe
        CarbonFootprint building = new Building(10000, 0.233); // consumo em kWh e fator em kg CO2/kWh
        CarbonFootprint car = new Car(1500, 2.31); // consumo em litros e fator em kg CO2/litro
        CarbonFootprint bicycle = new Bicycle(500, 0.0); // distancia em km e fator de emissao zero para bicicleta

        // armazenando objetos no ArrayList
        List<CarbonFootprint> items = new ArrayList<>();
        items.add(building);
        items.add(car);
        items.add(bicycle);

        // iterando sobre o ArrayList e exibindo as infos de cada objeto
        for (CarbonFootprint item : items) {
            item.printInfo();
        }
    }
}
