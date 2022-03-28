package aula.pkg02_revisão;
public class Caneta {
    String modelo; 
    String cor;
    float ponta;
    int carga; 
    boolean tampada;
    public void rabiscar(){
        if (this.tampada = false){
            System.out.println("ERRO! A caneta está tampada. Logo, não será possivel a usar.");
        } else{
            System.out.println("A caneta está destampada. Use para o quê precisar.");
        }
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
        
    }
    
    public void status(){
        System.out.println("Modelo da caneta:"+ this.modelo);
        System.out.println("Cor da caneta:"+ this.cor);
        System.out.println("Ponta da caneta:"+ this.ponta);
        System.out.println("Carga da caneta:"+ this.carga);
        System.out.println("A caneta está tampada: "+ this.tampada);
    }
}
