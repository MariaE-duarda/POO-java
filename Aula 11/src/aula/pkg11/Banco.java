package aula.pkg11;

public class Banco {
    String nomeB;
    String tipoC;
    String nomeCliente;
    boolean abertura;
    float saldo;
    boolean saque;
    float quantia;
    
    void abrirConta(){
        if (this.abertura = true){
            System.out.println("A conta do cliente está aberta!");
            
        }else{
            System.out.println("A conta do cliente ainda não foi cadastrada. Se possível, cadastrar para usuflir da conta.");
        }
    }
   
    
    public void informações(){
        System.out.println("O nome do banco que o cliente utiliza é: "+ this.nomeB);
        System.out.println("Nome do Titulante: "+ this.nomeCliente);
        System.out.println("Tipo da conta que "+ this.nomeCliente+ " usa: "+this.tipoC);
        System.out.println("A conta bancária do cliente ja está aberta? "+ this.abertura);
        System.out.println("Saldo da conta do cliente: R$"+ this.saldo+ "0");
        System.out.println("O titulante deseja saquar alguma quantia? "+ this.saque);
        System.out.println("QUANTO? R$"+ this.quantia+"0");
    }
}
