
package javaapplication29;
import java.util.Scanner;
public class JavaApplication29 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
      
    String letra;
        System.out.println("Digite uma vogal: ");
        letra= sc.nextLine();

switch(letra) {
      case ("A"):
            System.out.println("1ª vogal");
            break;
      case ("E"):
      case ("e"):
            System.out.println("2ª vogal");
            break;
      case ("I"):
      case ("i"):
            System.out.println("3ª vogal");
            break;
      case ("O"):
      case ("o"):
            System.out.println("4ª vogal");
            break;
      case ("U"):
      case ("u"):
            System.out.println("5ª vogal");
            break;
      default:
            System.out.println("Não é vogal");
}

 

    }
    }