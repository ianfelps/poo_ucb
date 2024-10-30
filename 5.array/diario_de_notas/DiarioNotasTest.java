public class DiarioNotasTest{

    public static void main(String[] args) {
        // notas dos alunos
        int[] notasAlunos = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87 , 90, 10};

        // criacao do objeto DiarioNotas
        DiarioNotas diario = new DiarioNotas("Programacao Orientada a Objetos", notasAlunos);

        // exibir relatorio
        diario.exibirRelatorio();
    }
}