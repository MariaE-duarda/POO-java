package aula.pkg04.complemento;
/**
 *
 * @author Eduarda Araújo
 */
public class Celular {
    public String Marca; 
    public float Polegadas; 
    public int Memoria; 
    public int Fabricação; 
    public String Cor; 
    
    //Métodos Getter...
    public String getMarca (){
        return this.Marca; 
    }
    
    public String getCor (){
        return this.Cor;
    }
    
    //Métodos Setter...
    public void setMarca(String m){
        this.Marca = m; 
    }
    
    public void setCor (String c){
        this.Cor = c;
    }
    
    void Status (){
        System.out.println("Características do Celular: ");
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Cor: "+ this.Cor);
        System.out.println("Polagedas: " + this.Polegadas + "'");
        System.out.println("Mémoria: " + this.Memoria + " GB"); 
        System.out.println("Fabricação: " +this.Fabricação); 
    }
    
    
}

 
