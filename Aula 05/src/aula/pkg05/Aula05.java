
package aula.pkg05;
import java.util.Scanner;

public class Aula05 {
    public static void main(String[] args) {
     int n1, n2, n3, media;
     
     Scanner c1 = new Scanner (System.in);
     System.out.print("Digite a 1° nota: ");
     n1 = c1.nextInt();
     
     System.out.print("Digite a 2° nota: ");
     n2 = c1.nextInt();
     
     System.out.print("Digite a 3° nota: ");
     n3 = c1.nextInt();
     
     media = (n1+n2+n3)/3;
     
     System.out.println("Sua média resultou em: " + media);
    }
    
}
