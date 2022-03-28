package aula.de.revisão_00;
/**
 *
 * @author Eduarda Araújo
 */
public class Estojo_Escolar {
    public String cor; 
    public String Marca;
    public int Bolsos; 
    public String Materiais; 
    public boolean Aberta; 
    
    public void Status () {
        System.out.println("Características do produto: "); 
        System.out.println("Marca do estojo: " + this.Marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Quantidade de bolsos: " + this.Bolsos);
        System.out.println("Materiais: " + this.Materiais);
        System.out.println("Está aberta? " + this.Aberta + ".");
        
    } 
    
    public void ABrir(){  
        if (this.Aberta == true){
            System.out.println("A bolsa está aberta, pegue algo se necessário.");
        } else {
            System.out.println("A bolsa está fechada, se houver permissão, pode abrí-la.");
        }
    }
    
    public void Fechar(){
        this.Aberta = true; 
    }
    
    
}
