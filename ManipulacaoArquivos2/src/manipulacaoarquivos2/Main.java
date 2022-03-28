package manipulacaoarquivos2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter; 
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
/**
 *
 * @author Maria Eduarda de Araujo Freire 
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic hereing)

        File dir = new File ("202019010016");
        if (dir.exists()){
        }else {
            boolean statusDir = dir.mkdir();
            System.out.println("Diretório criado");
        }
        
        File arquivo = new File(dir, "202019010016.txt");
        if (arquivo.exists()) {
        } else {
            try {              
             boolean statusArquivo = arquivo.createNewFile();
                System.out.println("Arquivo criado");
            } catch (IOException exception) {
                System.out.println(exception.getMessage());
            }
        }
        
        try{
            FileWriter escrever = new FileWriter(arquivo);
            PrintWriter printW = new PrintWriter(escrever);
            
            printW.println("Matrícula: 202019010016");
            printW.println("Nome: Maria Eduarda de Araujo Freire");
            printW.println("CPF: 166.675.544-38");
            
            printW.flush();
            printW.close();
        } catch (IOException exception2) {
            System.out.println(exception2.getMessage());
        } 
           
        try{
            FileReader ler = new FileReader(arquivo);
            BufferedReader bufferedR = new BufferedReader(ler);
            
            String line = "";
          
                while( (line = bufferedR.readLine()) != null ) {
                    System.out.println(line);
                }                 
                ler.close();
                bufferedR.close();
                
        } catch(FileNotFoundException fnfException) {
            System.out.println(fnfException.getMessage());
        }catch(IOException exception3) {
                System.out.println(exception3.getMessage());
        }           
    }
}