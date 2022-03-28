package bancosimple;

import java.util.ArrayList;
import java.util.Scanner;

public class BancoSimple {
public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String aux; 
      int opção, numero;
      double valor;
      ArrayList <Conta> lc = new ArrayList();
      Conta c1;
      
      do{
          System.out.println(" ");
          System.out.println("--- MENU ---");
          System.out.println("1- Criar conta;");
          System.out.println("2- Saldo;");
          System.out.println("3- Saque;");
          System.out.println("4- Depósito;");
          System.out.println("0- Sair.");
          
          System.out.println("Escolha uma das opções: ");
          opção = scan.nextInt();
          
          switch (opção){
              case 1: //criar nova conta
                  System.out.println("Digite o nome do titular: ");
                  aux = scan.next();
                  
                  c1 = new Conta(aux);
                  lc.add(c1);
                  System.out.print("Digite o valor inicial da conta: R$ ");
                  valor = scan.nextDouble();
                  
                  c1.despositarSimple(valor);
                  
                  System.out.println(" ");
                  System.out.println("Conta criada com sucesso!");
                  
                  c1.numeroConta();
                  // a primeira conta sempre iniciará com o número 1.
                  
                  break; 
                  
              case 2: // saldo
                  System.out.println("Digite o número da conta: ");
                  numero = scan.nextInt();
                  
                  c1= lc.get(numero -1);
                  
                  c1.valorSaldo();
                  break;
                  
              case 3: //saque
                  System.out.println("Digite o número da conta: ");
                  numero = scan.nextInt();
                  
                  c1= lc.get(numero -1);
                  
                  System.out.println("Digite o valor do saque: R$");
                  valor = scan.nextDouble();
              
              c1.Sacar(valor);
                  break;
                  
              case 4: //depositar
                  System.out.println("Digite o número da conta: ");
                  numero = scan.nextInt();
                  
                  c1= lc.get(numero -1);
                  
                  System.out.println("Digite o valor do depósito: R$");
              valor = scan.nextDouble();
              
              c1.Depositar(valor);
                  break; 
                  
              default: // quando em 1, 2, 3, 4 ou 5 forem digitados
                  if (opção != 0){
                      System.out.println("Opção inválida.");
                  }
                  break;
            }
         
          System.out.println(" ");
          
        }while (opção != 0);
     }
    
}
