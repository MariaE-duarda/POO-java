
package aula.pkg11;
public class Aula11 {

    public static void main(String[] args) {
        Banco nm = new Banco();
        nm.nomeB= "Nubank";
        nm.nomeCliente = "Maria Eduarda";
        nm.tipoC = "Corrente";
        nm.abertura = true;
        nm.saldo = 120.50f;
        nm.saque = true;
        nm.quantia = 20;
        
        
        nm.abrirConta();
        nm.informações();
   
    }
    
}
