
package boasvindas;
import java.util.Scanner;
public class BoasVindas {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner n1 = new Scanner (System.in);
        String nome;
        int idade, niver;
        
        System.out.println("Olá, me informe o seu nome: ");
        nome = n1.next();
        System.out.println("Agora me diga a sua idade: ");
        idade = n1.nextInt();
        
        niver = idade+1;
        
        System.out.println("Seja bem-vindo "+nome+". E desde já parabéns para o aniversário de "+ niver+ " anos.");
        
    }
    
}
