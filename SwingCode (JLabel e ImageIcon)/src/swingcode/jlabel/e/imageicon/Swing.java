package swingcode.jlabel.e.imageicon;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Maria Eduarda de Araujo Freire
 */
public class Swing extends JFrame{
    private JLabel label1,label2; 
    private ImageIcon icone = new ImageIcon ("C:/Users/Eduarda Araújo/Desktop/gif/jk.gif");
    public Swing() {
        this.setTitle("Janela");
        this.setSize(500, 250);
        this.setLocation(50, 50);
        this.getContentPane().setBackground(Color.white);
        
        this.label1 = new JLabel("esquerda",icone,JLabel.LEFT);
        this.label2 = new JLabel("esquerda",icone,JLabel.RIGHT); 
        
        this.getContentPane().setLayout(new GridLayout (2, 1));
        this.getContentPane().add(this.label1);
        this.getContentPane().add(this.label2);
        
    }
    
}
