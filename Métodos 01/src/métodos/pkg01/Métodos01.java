
package métodos.pkg01;

public class Métodos01 {

    /**
     * @param args the command line arguments
     */
    public static int subtracacao (int a, int b){
        int s = a-b;
        System.out.println("O total da subtração é: "+ s);
        return s;
    }
    
    public static int imprimeArrya (int vetor[]){
        int resSoma = 0;
       for (int i= 0; i< vetor.length; i++){
           resSoma = resSoma + vetor [i]; 
       }
        
       return resSoma;    
    }
    
    public static void ImprimeNomeDiscente(){
        System.out.println("Maria Eduarda de Araújo Freire");
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
       subtracacao(4,9);
       ImprimeNomeDiscente();
       
       int b []= {3, 0};
        System.out.println("A soma do vetor é: "+ imprimeArrya(b));

    }

}
