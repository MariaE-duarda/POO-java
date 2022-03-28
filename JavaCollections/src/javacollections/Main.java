package javacollections; 
/**
 *
 * @author Maria Eduarda de Araújo Freire
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        
        /*requisito 2.3*/ 
        List<Discente> discentes = new ArrayList<Discente> ();
        
        /*requisito 2.4*/
        Discente people1 = new Discente("Eduarda", 2020190111); //será removido
        discentes.add(people1);
        Discente people2 = new Discente("Júlio", 2020190222);
        discentes.add(people2);
        Discente people3 = new Discente("Nicácio", 2020190333);
        discentes.add(people3);
        
        System.out.println("\nA seguir, Lista inicial de discentes: ");
        /* requisito 2.5*/ imprimeListaDeDiscentes(discentes);
        System.out.println("\nRecuperação do discente de posição 3: ");
        /* requisito 2.6*/ Discente stuGet = discentes.get(2);
        /* requisito 2.7*/ imprimeDiscente(stuGet);
        System.out.println("\nRemoção do discente de posição 1: ");
        /* requisito 2.8*/ Discente stuRem = discentes.remove(0);
        /* requisito 2.9*/ imprimeDiscente(stuRem);
        
        Discente people4 = new Discente("Lucas", 2020190444);
        Discente people5 = new Discente("Bianca", 2020190555);
        Discente people6 = new Discente("Heloisa", 2020190666);
        
        /* requisito 2.10*/ discentes.addAll(Arrays.asList(people4, people5, people6));
        System.out.println("\nLista final de discentes: ");
        /* requisito 2.11*/ imprimeListaDeDiscentes(discentes);
    }   
      /*requisito 2.1*/
    public static void imprimeDiscente(Discente d1){
        System.out.println("Nome: "+ d1.getNome() + ", matrícula: "+ d1.getMatricula());
    }
    
      /*requisito 2.2*/ 
    public static void imprimeListaDeDiscentes (List<Discente> student){
       for (Discente d1 : student){
           imprimeDiscente(d1);
           
       } 
    }
}
