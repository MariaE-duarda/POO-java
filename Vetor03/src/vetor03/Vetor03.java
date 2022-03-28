
package vetor03;
import java.util.Arrays;
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num[]= {20,90,30,60,10,40};
        for (int v: num){ 
        System.out.print(v+" ");
        
    }
        System.out.println(" ");
        int position= Arrays.binarySearch(num, 40);
        System.out.println("O valor pesquisado se encontra na posição: "+position);
    }
    
}
