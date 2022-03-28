
package aula.pkg12_;
public class Banco {
    String nomeTitulante;
    int numero;
    float saldo;
    

    public void depositar(float valor){
        saldo +=valor;
    }
    
    public boolean sacar (float valor2){
        if (saldo>=valor2){
            saldo-=valor2;
            return true;
        }else{
            System.out.println("Saldo insuficiente para o saque de: R$"+valor2);
            return false;
        }
    }
  } 

