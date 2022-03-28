package camisetas;
import java.util.Scanner;
/**
 *
 * @author Maria Eduarda de Araujo Freire
 */
public class camisetas {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int N = 5; //numero de premiados 
        int P = 0;
        int M = 0;
        int T = 0;
        
        System.out.println("1) Tamanha P e 2) Tamanho M: ");
        T = entrada.nextInt();
        
        if ( T == 1){
            P++;
        }
        
        if (T == 2){
            M++;
        }
        
        if (P + M >= N ){
            System.out.println("S");
        }else {
            System.out.println("N");
        }
    }
    
}
