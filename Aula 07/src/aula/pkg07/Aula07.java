package aula.pkg07;
import java.util.Scanner;
public class Aula07 {
    public static void main(String[] args) {
        
      int numero;
      Scanner num = new Scanner(System.in);
      System.out.print("Qual a sua idade? ");
      numero = num.nextInt();
      
      if (numero <= 17){
          System.out.println("Você é menor de idade, portanto não beba até completar a maioridade.");
          
      } else 
            System.out.println("Você é maior de idade.");
    }
    
}
