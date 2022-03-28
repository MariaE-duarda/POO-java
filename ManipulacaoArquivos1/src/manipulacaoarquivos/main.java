package manipulacaoarquivos2;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
/**
 *
 * @author Maria Eduarda de Araujo Freire 
 */
public class main {
    public static void main(String[] args) {
        // TODO code application logic here
        // criação de diretórios!!!
        File dir = new File ("C://Diretório");
        boolean statusDir = dir.mkdir(); /*Return true = arquivo salvo!*/ /*Return false = arquivo não salvo...*/ 
        System.out.println(statusDir); 
        
       //criação de arquivos
       File arquivo = new File (dir, "teste_java.txt"); 
       boolean statusArq;

       try{
           statusArq = arquivo.createNewFile();
           System.out.println(statusArq); 
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
       
        
        
    }

}
