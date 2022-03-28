
package seunome;

import javax.swing.JOptionPane;

public class SeuNome {
    public static void main(String[] args) {
       
        int n1,n2,n3, media;
        String P1n, P2n, P3n;
        
        P1n = JOptionPane.showInputDialog("Informe a 1° nota: ");
        P2n = JOptionPane.showInputDialog("Informe a 2° nota: ");
        P3n = JOptionPane.showInputDialog("Informe a 3° nota: ");
        
        n1 = Integer.parseInt(P1n);
        n2 = Integer.parseInt(P2n);
        n3 = Integer.parseInt(P3n);
        
        media = (n1+n2+n3)/3;
        
       JOptionPane.showMessageDialog(null, "A média do aluno é: " + media);
       System.exit(0);
         
        
    }
    
}
