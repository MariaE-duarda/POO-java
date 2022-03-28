package manipulacaoarquivos;

/**
 *
 * @author Maria Eduarda de Araujo Freire
 */
public class main {
    public static void main(String[] args) {
        // TODO code application logic here
        
     String arq = "file.txt";
     String texto = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
             + "Pellentesque pulvinar, ante sed fermentum pulvinar, dui est fringilla erat, "
             + "sed pellentesque leo mauris vitae augue. ";
     
     if(arquivo.Write(arq, texto))
        System.out.println("Arquivo salvo com sucesso!");
     else 
        System.out.println("Erro ao salvar o arquivo...");
  }
}
    
