package aula.de.revisão_01;
public class Caderno {
    public String gênero;
    public int materias; 
    public int quantdfolhas; 
    public boolean novo; 
    public String cor; 
    
    
    public void status() {
        System.out.println("Características do caderno: ");
        System.out.println("Gênero: " + this.gênero +".");
        System.out.println("Quantidade de matérias: " +this.materias);
        System.out.println("Quantidade total de folhas: "+ this.quantdfolhas + " páginas.");
        System.out.println("Cor predominante: " + this.cor);
        System.out.println("Já foi usado antes? " + this.novo);
    }
}
