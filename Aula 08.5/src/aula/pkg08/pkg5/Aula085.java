
package aula.pkg08.pkg5;
import java.util.Scanner;
/**
 *
 * @author Eduarda Araújo
 */
public class Aula085 {
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, ant, suc;
        
        Scanner n1 = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = n1.nextInt();
        
        ant = numero-1;
        suc = numero + 1;
        
        System.out.println("O antecessor de " + numero+ " é: " +ant+ " e seu sucessor será: "+suc);
    }
    
}
