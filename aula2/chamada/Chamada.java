// classe Chamada que contém variável de instância
public class Chamada {

    private String nomeCurso; // nome do curso para essa Chamada
    private String nomeProfessor; // atributo do nome do professor
    
    // o construtor inicializa nomeCurso
    public Chamada(String nome_do_curso, String nome_do_professor){
        this.nomeCurso = nome_do_curso; // inicaliza o nome do curso
        this.nomeProfessor = nome_do_professor; // inicaliza o nome do professor
    } // fim do construtor
        
    //método para configurar o nome do curso
    public void setNomeCurso(String nome_do_curso){
        this.nomeCurso = nome_do_curso; // armazena o nome do curso
    } // fim do método set
        
    //método para recuperar o nome do curso
    public String getNomeCurso(){
        return this.nomeCurso;
    } // fim do método get

    // setter do nome do professor
    public void setNomeProfessor(String nome_do_professor){
        this.nomeProfessor = nome_do_professor;
    }

    // getter do nome do professor
    public String getNomeProfessor(){
        return this.nomeProfessor;
    }
        
    //exibe uma mensagem de boas-vindas para o usuário
    public void mensagem(){
        //chama getNomeCurso para obter o nome do curso
        System.out.println("Bem vindo à Chamada do curso de " + getNomeCurso() + ", com o professor " + getNomeProfessor() + "!");
    } //fim do método mensagem

} //fim da classe