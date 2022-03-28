package _barramenu;
import java.awt.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import javax.swing.*;
public abstract class BarraMenu extends JFrame implements ActionListener{

    JMenuBar menuBar;
    JTextField t1;
    JMenu menuArquivo, menuCliente;
    JMenuItem miAjuda, miClienteEspecial, miClienteComum, miFornecedor, miSair;
    
    private void perfomance (ActionEvent e){
        if (e.getSource() == miClienteEspecial){
            t1.setText("Escolhido o item: Cliente Especial.");
        } else if (e.getSource() == miClienteComum){
            t1.setText("Escolhido o item: Cliente Comum.");
        } else if (e.getSource() == miFornecedor) {
            t1.setText("Escolhido o item: Fornecedor.");
        } else if (e.getSource() == miAjuda) {
            t1.setText("Escolhido o Menu ajuda.");
        } else if (e.getSource() == miSair){
            System.exit(0);
        } else {
            t1.setText("O item escolhido é inválido...");
        }
    }
    
    public BarraMenu(){
        this.setBounds(150, 50, 480, 280);
        this.setTitle("Utilização do JMenu");
        this.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        this.t1 = new JTextField(30);
        this.getContentPane().add(t1);
        this.menuBar = new JMenuBar();
        this.setJMenuBar(this.menuBar);
        this.menuArquivo = new JMenu("Arquivo");
        this.menuCliente = new JMenu("Cliente");
        this.miClienteComum = new JMenuItem("Cliente Comum");
        this.miClienteEspecial = new JMenuItem("Cliente Especial");
        this.menuArquivo.add(menuCliente);
        this.menuCliente.add(this.miClienteComum);
        this.menuCliente.add(this.miClienteEspecial);
        this.miFornecedor = new JMenuItem("Fornecedor");
        this.menuArquivo.add(this.miFornecedor);
        this.miSair = new JMenuItem("Sair");
        this.menuArquivo.add(this.miSair);
        this.miAjuda = new JMenuItem("Menu Ajuda");
        this.menuBar.add(this.menuArquivo);
        this.menuBar.add(this.miAjuda);
        this.miAjuda.addActionListener(this);
        this.miClienteComum.addActionListener(this);
        this.miClienteEspecial.addActionListener(this);
        this.miFornecedor.addActionListener(this);
        this.miSair.addActionListener(this);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame janela = new BarraMenu() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        };
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
    }
    
}
