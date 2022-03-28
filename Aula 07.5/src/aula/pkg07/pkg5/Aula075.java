
package aula.pkg07.pkg5;
import java.util.Scanner;

public class Aula075 {
    public static void main(String[] args) {
        // TODO code application logic here
        double nota;
        
        Scanner md = new Scanner(System.in);
        System.out.print("Por favor, informe sua média bimestral: ");
        nota = md.nextDouble();
        
        if (nota >= 60){
            System.out.println("Aluno aprovado.");
        } 
        
        if (nota <60){
            System.out.println("Aluno em recuperação.");
            
        }
        
        if (nota < 20){
            System.out.println("Aluno reprovado por média.");
        }
    }
    
}
