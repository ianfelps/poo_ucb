/*
Modifique a classe Chamada com: Inclua uma variável de instância String que representa o nome do professor do curso; Forneça os métodos set e get para alterar e recuperar o nome do professor, respectivamente; Modifique o construtor para especificar dois parâmetros; Modifique o método chamada para gerar a saída de mensagem para o nome do curso e nome do professor.
*/

//Cria objeto Chamada e passa uma String para seu método mensagem
import java.util.Scanner;

    public class ChamadaTest{ // método main inicia a execução

        public static void main(String[] args){

            Scanner input = new Scanner(System.in); // cria objeto Chamada
            
            Chamada minhaChamada = new Chamada("Física", "João");
            
            // exibe valor inicial de nomeCurso
            System.out.println("Nome do curso inicial é " + minhaChamada.getNomeCurso());
            
            // exibe valor inicial de nomeCurso
            System.out.println("Nome do professor inicial é " + minhaChamada.getNomeProfessor());
            
            // solicita e lê o nome do curso
            System.out.println("Coloque o nome do curso: ");
            String curso = input.nextLine();

            // solicita e lê o nome do professor
            System.out.println("Coloque o nome do professor: ");
            String professor = input.nextLine();
            
            minhaChamada.setNomeCurso(curso); // configura o nome do curso
            minhaChamada.setNomeProfessor(professor); // configura o nome do professor
            
            System.out.println(); // gera saída de uma linha em branco
            
            // chama o método mensagem de minhaChamada e passa o nomeDoCurso no argumento
            minhaChamada.mensagem();

        } // fim do método

} // fim da classe