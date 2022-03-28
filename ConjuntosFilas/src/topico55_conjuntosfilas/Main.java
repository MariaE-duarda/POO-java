package topico55_conjuntosfilas;
/**
 *
 * @author Maria Eduarda de Araújo Freire
 */

import java.util.Set;
import java.util.HashSet;
import java.util.Queue;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here

        Set <Docente> docentesConj = new HashSet<>();

        Docente people1 = new Docente (11111, "João");
        Docente people2 = new Docente (22222, "Maria");
        Docente people3 = new Docente (33333, "Ana");
        Docente people4 = new Docente (44444, "Raylla");
        Docente people5 = new Docente (55555, "Eduarda");
 
        docentesConj.add(people1);
        docentesConj.add(people2); 
        docentesConj.add(people3);
        docentesConj.add(people4);
        docentesConj.add(people5);
        
        System.out.println("Conjunto de docentes: ");
 
        for (Docente do1 : docentesConj) {
            System.out.println("Nome: "+ do1.getNome()+ ", siape: "+ do1.getSiape());
        }

        Queue <Docente> docentesFil = new ArrayDeque <>();
         
        docentesFil.add(people1);
        docentesFil.add(people2); 
        docentesFil.add(people3);
        docentesFil.add(people4); 
        docentesFil.add(people5);

        Docente recupDocent = docentesFil.peek();
        System.out.println("\nRecuperação do primeiro docente: ");
        System.out.println("Nome: "+ recupDocent.getNome() + ", siape: "+ recupDocent.getSiape());
        
        Docente recupRemDocent = docentesFil.poll();
        System.out.println("\nDocente removido: ");
        System.out.println("Nome: "+ recupRemDocent.getNome()+ ", siape: " + recupRemDocent.getSiape());
        
        Docente recupDocent2 = docentesFil.peek();
        System.out.println("\nRecuperação do primeiro docente: ");
        System.out.println("Nome: "+ recupDocent2.getNome() + ", siape: "+ recupDocent2.getSiape());
        
        System.out.println("\nFila de docentes: ");
         
        for (Docente do1 : docentesFil) {
            System.out.println("Nome: "+ do1.getNome()+ ", siape: "+ do1.getSiape());
        }
    }
    
}
