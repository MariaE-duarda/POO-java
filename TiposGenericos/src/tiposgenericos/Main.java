package tiposgenericos;
/**
 *
 * @author Eduarda Araújo
 */
public class Main <T,S> {
    private T ob;
    private S ob2;
    
    public Main (T ob, S ob2){ 
        this.ob = ob;
        this.ob2 = ob2; 
    }
    
    public void mostrarTipo(){
        System.out.println(ob.getClass().getName());
        System.out.println(ob2.getClass().getName());
    }
    
    public String toString(){
        return this.ob + "," + this.ob2;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Main <Integer, String> obj1 = new Main <>(4, "Quatro");
        Main <Integer, String> obj2 = new Main <>(5, "Cinco"); 
        obj1.mostrarTipo();
        obj2.mostrarTipo();
        
        System.out.println(obj1);
        System.out.println(obj2);
    }
    
}
