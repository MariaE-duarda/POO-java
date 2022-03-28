package banco;
public class Conta {
    String nomeTitular;
    int numero;
    double saldo;
    
    public void depositar (double valor){
        this.saldo += valor;
    }
    
    public boolean sacar (double valor){
        if (this.saldo>= valor){
            this.saldo -= valor;
            return true;
        }else {
            return false;
        }
    }
 }
    
