package aula.pkg04;
public class Caneta {
    public String modelo;
    public float ponta;
    public String cor; 
    public boolean tampada;
    
    public Caneta (String m, String c, float p){ //método construtor
        this.modelo = m;
        this.ponta = p;
        this.cor = c;
        this.tampar(); 
    }
    
    public String getModelo (){ //Método Getter 
        return this.modelo;
    }
    
    public void setModelo (String m){  // Método Setter 
         this.modelo = m; 
    }
    
    public float getPonta(){ // Método Getter 
        return this.ponta;
    }
    
    public void setPonta (float p){  // Método Setter 
        this.ponta = p; 
    }
    
    void status () {
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: "+ this.getModelo());
        System.out.println("Ponta: "+this.getPonta());
        System.out.println("Cor da caneta: " + this.cor);
        System.out.println("  ");
        
    }
    
    public void tampar (){ 
        this.tampada = true; 
    }
    
    public void destampar (){
        this.tampada = false; 
    }
            
}
