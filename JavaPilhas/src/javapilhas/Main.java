package javapilhas;
/**
 *
 * @author Maria Eduarda de Araujo Freire
 */

import java.util.Stack;
import java.util.TreeMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Stack <Pessoa> pilha = new Stack<>();
        
        Pessoa people1 = new Pessoa ("111.111.111-00", "João");
        Pessoa people2 = new Pessoa ("111.111.111-11", "Marcos");
        Pessoa people3 = new Pessoa ("111.111.111-22", "Ana"); 
        
        pilha.push(people1);
        pilha.push(people2); 
        pilha.push(people3); 
        
        if (pilha.isEmpty() == true){
            System.out.println("A pilha está vazia");
        }else{
            for (Pessoa pes : pilha) {
              System.out.println("Nome: "+ pes.getNome()+ ", CPF: "+ pes.getCpf());
            }
              System.out.print("\nPessoa desempilhada: ");
              Pessoa desempilhado = pilha.pop();
              System.out.println("Nome: "+ desempilhado.getNome()+ ", CPF: "+ desempilhado.getCpf());
            
              System.out.println(" ");
              for (Pessoa pes1 : pilha) {
              System.out.println("Nome: "+ pes1.getNome()+ ", CPF: "+ pes1.getCpf());
            } 
        }
        
        Map <String, String> mapa = new TreeMap<String, String>();

        mapa.put("CPF: "+people1.getCpf(), " nome: "+people1.getNome());
        mapa.put("CPF: "+people2.getCpf(), " nome: "+people2.getNome());
        mapa.put("CPF: "+people3.getCpf(), " nome: "+people3.getNome());

        System.out.println("\n"+mapa);
       
    } 
}
