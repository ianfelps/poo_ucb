public class TrafficLightTest {
    public static void main(String[] args) {

        // for para percorrer o enum
        for (TrafficLight light : TrafficLight.values()) {
            System.out.println("Cor da Luz: " + light + ", Duração da Luz: " + light.getDuracaoLuz() + " segundos");
        }
    }
}
