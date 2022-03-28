package janelacadastro;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JanelaCadastro extends JFrame implements ActionListener{
    
    private JLabel lineOne, lineTwo, lineThree;
    private JTextField text;
    private JPasswordField pass1, pass2;
    private JButton botton;
    private JPanel painel;
    
    public JanelaCadastro(){
        this.lineOne = new JLabel("Login: ", JLabel.LEFT);
        lineOne.setForeground(Color.WHITE);
        this.text = new JTextField();
        this.lineTwo = new JLabel("Senha: ", JLabel.LEFT);
        lineTwo.setForeground(Color.WHITE);
        this.pass1 = new JPasswordField();
        this.pass1.setEchoChar('*');
        this.lineThree = new JLabel("Confirmação da Senha: ", JLabel.LEFT);
        lineThree.setForeground(Color.WHITE);
        this.pass2 = new JPasswordField();
        this.pass2.setEchoChar('*');
        this.painel = new JPanel();
        this.botton = new JButton("Cadastrar");
        
        this.setTitle("Tela de Cadastro");
        this.setSize(300, 150);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(85, 132, 172)); 
        botton.setBackground(new Color(200, 75, 49));
        botton.setForeground(Color.WHITE);
    
        this.getContentPane().setLayout(new GridLayout(4,3));
        this.getContentPane().add(this.lineOne);
        this.getContentPane().add(this.text);
        this.getContentPane().add(this.lineTwo);
        this.getContentPane().add(this.pass1);
        this.getContentPane().add(this.lineThree);
        this.getContentPane().add(this.pass2);
        this.getContentPane().add(this.painel);
        this.botton.addActionListener(this);
        this.getContentPane().add(this.botton);           
            
        }
    
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == this.botton){
                String senha1 = new String (this.pass1.getText());
                String senha2 = new String (this.pass2.getText());
                
                if (senha1.equals(senha2)){
                  this.setTitle("Tela de Cadastro");
                  String s = "Usuário cadastrado com sucesso!";
                  JOptionPane.showMessageDialog(null, s, "Messagem", JOptionPane.INFORMATION_MESSAGE);
                }else {
                  this.setTitle("Tela de Cadastro");
                  String s = "Não foi possível cadastrar o usuário, pois as senhas informadas são diferentes.";
                  JOptionPane.showMessageDialog(null, s, "Messagem", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public static void main(String[] args) {
        JFrame cadastro = new JanelaCadastro();
        cadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cadastro.setVisible(true);
    }

}
