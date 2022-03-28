
package bancosimple;
public class Conta {
    String nomeTitulante;
    int numero;
    double saldo;
    static int qntscontas= 0;
    
    public Conta(String pTitular){
        this.nomeTitulante = pTitular;
        qntscontas++;
        this.numero = qntscontas;
        this.saldo = 0;
    }
    
    public void numeroConta(){
        System.out.println("O número da conta criada é: "+this.numero);
    }
    
    public void DadosBancarios(){
        System.out.println(" ");
        System.out.println("-- DADOS BANCÁRIOS --");
        System.out.println("- Número: " +this.numero);
        System.out.println("- Titular: "+this.nomeTitulante);
        System.out.println("- Saldo: R$"  +this.saldo);
        System.out.println("-- FIM DADOS BANCÁRIOS --");
        System.out.println(" ");
    }
    
    public void Depositar(double pValor){
        
        this.saldo += pValor;
       }
    
    public boolean Sacar(double pValor){

        if (pValor<= this.saldo){
            this.saldo -=pValor;
            return true;
        }else{
            return false;
        }
        
    }
    
    public double valorSaldo(){
        System.out.println(" ");
        System.out.println("- Saldo da conta bancária: R$"+this.saldo);
        System.out.println(" ");
        return this.saldo;
    }
    
    public void despositarSimple(double pValor){
        this.saldo = this.saldo+pValor;
    }
}

