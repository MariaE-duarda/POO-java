package aula.pkg02;
public class Caneta {
    public String modelo;
    public String cor; 
    private float ponta; 
    protected int carga;
    private boolean tampada; 
    void status () {
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Carga: " + this.carga);
    } 
    public void rabiscar () {
        if (this.tampada==true) {
            System.out.println("ERRO! A caneta não pode rabiscar, pois está tampada.");
        } else {
                System.out.println("A caneta está riscando ou pode rabiscar!");
        }
         
    }
    
    public void tampar () {
        this.tampada = true;
    }
    
    public void destampar () {
        this.tampada = false; 
    }
}
