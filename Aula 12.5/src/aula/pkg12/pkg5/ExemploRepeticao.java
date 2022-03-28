
package aula.pkg12.pkg5;
import java.util.Scanner;

public class ExemploRepeticao {
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);
        do{
            System.out.println ("Digite 1 para ...");
            System.out.println ("Digite 2 para ...");
            System.out.println ("Digite 3 para ...");            
            int opcao = scan.nextInt ();
            
            if (opcao == 5) {
                break;
            }
        } while (true);
        System.out.println ("FIM !!!");
    }
}