import javax.swing.JFrame; // importar frame

public class DrawPanelTest{

    public static void main(String[] args){

        DrawPanel panel = new DrawPanel(); // instanciar objeto panel

        JFrame frame = new JFrame("Desenho no Java"); // instanciar objeto frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fechar programa
        frame.setSize(200, 200); // setar tamanho
        frame.setVisible(true); // tornar frame visivel
        frame.add(panel); // adicionar painel

    }

}