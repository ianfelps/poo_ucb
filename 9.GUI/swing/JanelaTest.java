import javax.swing.JFrame;

public class JanelaTest {
    
    public static void main(String[] args){

        Janela login = new Janela("Login");
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setSize(300, 600);
        login.setVisible(true);
    }
}