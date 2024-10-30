public enum TrafficLight{
    // luzes e suas duracoes
    RED(30),
    YELLOW(5),
    GREEN(30);

    // variavel de duracao da luz
    private final int duracaoLuz;

    // atribuir uma duracao para cada luz
    TrafficLight(int duracao) {
        this.duracaoLuz = duracao;
    }

    // getter
    public int getDuracaoLuz() {
        return duracaoLuz;
    }
}