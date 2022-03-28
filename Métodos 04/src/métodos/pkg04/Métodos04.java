
package métodos.pkg04;
import java.util.Scanner;
public class Métodos04 {

    public static void main(String[] args) {
        int[]abc = {2,0,2,0,1,9,0,1,0,0,1,6};
        verificaMatricula(abc);
    }
    
    public static void verificaMatricula (int[]x){
       if (x[11]%2 ==0){
           System.out.println("Matrícula é par.");
       } else {
           System.out.println("Matrícula é impar.");
       }
    }
}

