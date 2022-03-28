package aula.pkg06;
import java.util.Scanner;
public class Aula06 {
    public static void main(String[] args) {
        int n1, result;
        
      Scanner num = new Scanner(System.in);
      System.out.print("Informe um número: ");
      n1 = num.nextInt();
      
      result = n1*2;
        System.out.println("O dobro de "+n1+" é: "+ result);
    }
    
}
