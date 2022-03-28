
package javaapplication28;
import java.util.Scanner;
public class JavaApplication28 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        int n1, n2, n3, media; 
        
        System.out.println("Digite a primeira nota: ");
        n1 = sc.nextInt();
        
        System.out.println("Digite a segunda nota: ");
        n2 = sc.nextInt();
        
        System.out.println("Digite a terceira nota: ");
        n3 = sc.nextInt();
        
        media = (n1+n2+n3)/3;
        
        if (media >= 60){
            System.out.println("Aluno aprovado.");
        }else if (media<=20){
            System.out.println("Aluno reprovado.");
            
        } else 
            System.out.println("Aluno em recuperação.");
    }
    
}
