package banco;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Eduarda Araújo
 */
public class Banco {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        ArrayList <Conta> lista = new ArrayList<>();
        String titular;
        Conta c1;      
        int opção, numeroConta = 0;
        double pValor;
        int j= 5;
        
        do{
            System.out.println("-- MENU --");
            System.out.println("Escolha uma das opções: ");
            System.out.println("1- Criar conta");
            System.out.println("2- Saldo ");
            System.out.println("3- Fazer saque ");
            System.out.println("4- Fazer deposito ");
            System.out.print("Opção: ");
            opção = scan.nextInt();
            scan.nextLine();
            
            if (opção == 1){ //Criando conta
                for(int i = 1; i < 2; i++){
                numeroConta++;
                System.out.println("Digite o nome do titular: ");
                titular = scan.nextLine();
                
                c1 = new Conta();
                lista.add(c1);
                
                System.out.println(" ");
                System.out.print("Digite o saldo inicial da conta: R$");
                
                c1.saldo = scan.nextDouble();
                
                System.out.println("Número da conta criada: "+ numeroConta);
                System.out.println(" ");
                
                }
            }
            
            if (opção ==2){ //Saber o saldo 
                System.out.print("Informe o número da conta: ");
                numeroConta = scan.nextInt();
                
                c1= lista.get(numeroConta -1);
                System.out.println(" ");
                System.out.print("Valor do saldo: R$"+ c1.saldo);
                System.out.println(" ");
                System.out.println(" ");
            }
            
            if (opção == 3){ // fazendo um saque 
                System.out.print("Informe o número da conta: ");
                numeroConta = scan.nextInt();
                
                c1= lista.get(numeroConta -1);
                
                System.out.print("Digite o valor que deseja sacar: R$");
                pValor = scan.nextDouble();
          
                if (c1.sacar(pValor) == true){
                    System.out.println(" ");
                    System.out.println("Saque efetuado com sucesso!");
                    System.out.println(" ");
                }else {
                    System.out.println(" ");
                    System.out.println("Saque não efetuado...");
                    System.out.println(" ");
                    }
            }
            
            if (opção == 4){ // fazendo deposito 
                System.out.print("Informe o número da conta: ");
                numeroConta = scan.nextInt();
                c1= lista.get(numeroConta -1);
                
                System.out.print("Informe o valor do deposito: R$");
                pValor= scan.nextDouble();
                System.out.println(" ");
                
                c1= lista.get(numeroConta -1);
                c1.depositar(pValor);
            }
            
            if (opção> 4){
                break;
            }
                        
        }while (true);
         System.out.println(" ");
         System.out.println("Fim!!");
    }
 }