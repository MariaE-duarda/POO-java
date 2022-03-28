
package aula.pkg12_;

import java.util.Scanner;
public class Aula12_ {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Banco bn = new Banco();
        bn.nomeTitulante = "Eduarda";
        bn.numero = 01;
        bn.saldo = 250f;
        
        System.out.println("Nome do Titulante: "+ bn.nomeTitulante);
        System.out.println("Numero: "+ bn.numero);
        System.out.println("Saldo: R$"+ bn.saldo);
        bn.depositar(30);
        bn.sacar(300);
    }
    
}
