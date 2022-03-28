package aula.pkg09.pkg5;
import java.util.Scanner;

public class Aula095 {

    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, soma;
        
        Scanner num = new Scanner(System.in);
        
        System.out.println("Informe um número: ");
        n1 = num.nextInt ();
        System.out.println("Informe um outro número: ");
        n2 = num.nextInt();
        
        soma = n1+n2;
        
        System.out.println("A soma entre os números digitados é: " + soma);
        
    }
    
}
