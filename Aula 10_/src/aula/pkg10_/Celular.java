
package aula.pkg10_;
public class Celular {
    String marca;
    String modelo;
    String cor;
    float polegadas;
    int memoria;
    boolean capinha;
    boolean usado;
    boolean ligado;
    
    public void ligar (){
        if (this.ligado = true){
            System.out.println("O smartphone está ligado, basta usar!");
        }else{
            System.out.println("O Smartphone está desligado, para usar o produto: LIGUE-O!");
        }
        
       
    }
    
    public void status(){
        System.out.println("Marca do celular: "+ this.marca);
        System.out.println("Modelo do celular: "+ this.modelo);
        System.out.println("Cor do aparelho: "+ this.cor);
        System.out.println("Tamanho do celular: "+ this.polegadas+" polegadas.");
        System.out.println("Capacidade de memória do celular: "+ this.memoria+ " GB.");
        System.out.println("O aparelho possui capinha: "+ this.capinha);
        System.out.println("O celular já foi usado por outra pessoa? "+ this.usado);
        System.out.println("O aparelho está ligado? "+ this.ligado);
    }
    
}
