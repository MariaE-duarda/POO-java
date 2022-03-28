/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco1;

/**
 *
 * @author Eduarda Araújo
 */
public class Conta {
    private int numero;
    private String titular; 
    private double saldo; 
    static int qntscontas= 0;
    
    public Conta(String pTitular){
        this.titular = pTitular;
        qntscontas++;
        this.numero = qntscontas;
        this.saldo = 0;
    }
    
    public int numeroConta(){
        System.out.println("O número da conta criada é: "+this.numero);
        return this.numero;
    }
    
    public void DadosBancarios(){
        System.out.println(" ");
        System.out.println("-- DADOS BANCÁRIOS --");
        System.out.println("- Número: " +this.numero);
        System.out.println("- Titular: "+this.titular);
        System.out.println("- Saldo: R$"  +this.saldo);
        System.out.println("-- FIM DADOS BANCÁRIOS --");
        System.out.println(" ");
    }
    
    public void Depositar(double pValor){
        System.out.println(" ");
        System.out.println("--- Realizando Depósito ---");
        System.out.println("- Saldo anterior: R$"+this.saldo);
        
        this.saldo += pValor;
        
        System.out.println("- Saldo atual: R$"+this.saldo);
        System.out.println("-- FIM DO DEPÓSITO --");
        System.out.println(" ");
    }
    
    public boolean Sacar(double pValor){
        System.out.println(" ");
        System.out.println("--- REALIZANDO SAQUE ---");
        System.out.println("- Saldo anterior: R$"+ this.saldo);
        
        if (pValor<= this.saldo){
            this.saldo -=pValor;
            System.out.println("- Saldo atual: R$"+this.saldo);
            System.out.println("SAQUE REALIZADO COM SUCESSO!");
            return true;
        }else{
            System.out.println("SAQUE NÃ EFETUADO.");
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
