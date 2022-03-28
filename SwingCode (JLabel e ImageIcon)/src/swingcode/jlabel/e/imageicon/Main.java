package swingcode.jlabel.e.imageicon;

import javax.swing.JFrame;
import javax.swing.JRootPane;

/**
 *
 * @author Maria Eduarda de Araujo Freire
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame janela = new Swing();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
               
    }
    
}
