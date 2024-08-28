import javax.swing.JOptionPane; // importar tela (interface grafica)

public class Cachorro{ // criar classe
    
    // atributos da classe
    
    private String nome; // privar atributo para acessar somente via metodo (encapsulamento)
    
    // metodos da classe

    // construtor (1o metodo, mesmo nome da classe e publico)
    public Cachorro(String nome){
        this.nome = nome;
    }

    // encapsulamento
    public void setNome(String nome){ // colocar atributo
        this.nome = nome; // essa(this) class tem um atributo nome
    }

    public String getName(){ // retronar atributo
        return this.nome; // retornar nome;
    }

    public void latir(){
        JOptionPane.showMessageDialog(null, this.nome+" latiu: Au au!");
        // System.out.println(this.nome+" latiu: Au au!"); // funcao do metodo
    }

    public void lamber(){
        JOptionPane.showMessageDialog(null, this.nome+" lambeu!");
        // System.out.println(this.nome+" lambeu!");
    }
}