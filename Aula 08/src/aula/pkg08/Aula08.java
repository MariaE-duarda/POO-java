package aula.pkg08;
  import java.util.Scanner;
/**
 *
 * @author Eduarda Araújo
 */
public class Aula08 {
    public static void main(String[] args) {
        // TODO code application logic here
        double saldo, porcent, reduz;
        
        Scanner s1 = new Scanner(System.in);
        System.out.println("Digite o valor do seu saldo atualmente: ");
        saldo = s1.nextDouble();
        
        porcent = 0.01 *saldo;
        reduz = saldo-porcent;
        
        System.out.println("Com reajuste de 1%, o seu saldo passou a ser: R$"+ reduz);
    }
    
}
