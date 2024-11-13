// importar classes
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Janela extends JFrame {

    // atributos
    private final JTextField userField;
    private final JPasswordField passwordField;
    private final JLabel userLabel;
    private final JLabel passwordLabel;
    private final JButton loginButton;
    private final JButton registerButton;
    private final JCheckBox checkBox;
    private final JRadioButton profRadioButton;
    private final JRadioButton studRadioButton;
    private final JComboBox comboBox;
    private final JLabel iconLabel;

    // construtor
    public Janela(String title){
        super(title); // atributo do titulo

        setLayout(new FlowLayout()); // layout da tela

        Font textFont = new Font("Comic Sans MS", Font.PLAIN, 22); // fonte

        // criar labels de usuario e senha
        userLabel = new JLabel("Usuario: ");
        userLabel.setFont(textFont); // setar fonte
        passwordLabel = new JLabel("Senha: ");
        passwordLabel.setFont(textFont); // setar fonte

        // campos de texto
        userField = new JTextField("Usuario", 10);
        passwordField = new JPasswordField("Senha", 10);

        // botoes
        loginButton = new JButton("Acessar");
        registerButton = new JButton("Cadastrar");

        // check box
        checkBox = new JCheckBox("Lembrar-me");

        // radio buttons
        profRadioButton = new JRadioButton("Professor", false);
        profRadioButton.setFont(textFont);
        studRadioButton = new JRadioButton("Aluno", false);
        studRadioButton.setFont(textFont);

        // grupo de botoes (radio buttons)
        ButtonGroup bg = new ButtonGroup();
        bg.add(profRadioButton);
        bg.add(studRadioButton);

        // combo box
        String[] courses = {"Engenharia de Software", "Ciencia da Computacao", "Analise e Desenvolvimento de Sistemas", "Sistemas da Informacao", "Medicina", "Medicina Veterinaria"}; // array com os cursos
        comboBox = new JComboBox<String>(courses);
        comboBox.setMaximumRowCount(3); // maximo de linhas no combo box

        // icone
        ImageIcon icon = new ImageIcon(getClass().getResource("icon.png"));
        Image img = icon.getImage().getScaledInstance(256, 256, Image.SCALE_SMOOTH);
        iconLabel = new JLabel(new ImageIcon(img)); // label para o icone

        // adicionar elementos
        add(iconLabel);
        add(userLabel);
        add(userField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        add(registerButton);
        add(profRadioButton);
        add(studRadioButton);
        add(checkBox);
        add(comboBox);

        // eventos dos butoes
        ComponentsHandler handler = new ComponentsHandler();
        loginButton.addActionListener(handler);
        registerButton.addActionListener(handler);
        profRadioButton.addItemListener(handler);
        studRadioButton.addItemListener(handler);
        checkBox.addItemListener(handler);
    }

    // classe para tratar os eventos dos butoes
    private class ComponentsHandler implements ActionListener, ItemListener {
        
        // metodo da interface ActionListener
        @Override
        public void actionPerformed(ActionEvent event){
            if (event.getSource() == loginButton){
                String texto;
                texto = String.format("Usuario: %s \nSenha: %s \n%s \nLembrar: %s \nCurso: %s", userField.getText(), passwordField.getText(), (profRadioButton.isSelected()) ? "Professor" : "Aluno", (checkBox.isSelected()) ? "Sim" : "Nao", (String)comboBox.getSelectedItem());
                System.out.printf(texto);
            }
        }

        // metodo da interface ItemListener
        @Override
        public void itemStateChanged(ItemEvent event){
            if (studRadioButton.isSelected())
                System.out.println("Evento de item (Aluno)!");
            if (profRadioButton.isSelected())
                System.out.println("Evento de item (Professor)!");
        }
    }
}