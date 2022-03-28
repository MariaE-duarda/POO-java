
package métodos.pkg02;
public class Métodos02 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
            int tentei []= {6,1,0,0,1,0,9,1,0,2,0,2};
            int []ccc = ImpremiArray(tentei);
            
            for (int i=0; i<ccc.length; i++){
              System.out.println(ccc[i]);  
            }
    }
    
    
    public static int[] ImpremiArray (int[] abc){
       int[] xyz =new int [abc.length];
         for (int i =0, j= xyz.length -1; i<abc.length; ++i,--j){
             xyz[j]= abc[i];
         }
        
        return xyz;
    }
}
