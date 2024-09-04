import java.awt.Graphics; // classe para os desenhos
import javax.swing.JPanel; // painel(tela) para os desenhos

public class DrawPanel extends JPanel{ // herdar conteudo de JPanel (heranca)
    
    public void paint(Graphics g){ // metodo para pintar na tela
        
        super.paintComponent(g);

        int width = getWidth(); 
        int height = getHeight();

        g.drawLine(0, 0, width, height);
        g.drawLine(0, height, width, 0);

    }

}