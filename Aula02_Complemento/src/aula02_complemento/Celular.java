package aula02_complemento;
public class Celular {
    String cor; 
    String Marca; 
    float polegadas; 
    int fabricação; 
    int armazenamento; 
    boolean ligado; 
    
    void status () {
        System.out.println("Cor do aparelho: " + this.cor); 
        System.out.println("Marca: " + this.Marca);
        System.out.println("Quantidade de polegadas: " + this.polegadas);
        System.out.println("Data de fabricação: " + this.fabricação);
        System.out.println("Capacidade de armazenamento: "+ this.armazenamento);
        System.out.println("Está ligado? " + this.ligado);
    }
    void ligar () {
        if (this.ligado == true) {
            System.out.println("Se souber a senha, utilize o aparelho!");
        } else { 
                System.out.println("Celular desligado, antes de usar ligue");
        }
           
      }
      
    void desligar() {
        this.ligado = false; 
        
    }
}
