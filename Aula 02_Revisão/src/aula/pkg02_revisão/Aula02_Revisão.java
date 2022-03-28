package aula.pkg02_revisão;

public class Aula02_Revisão {
    public static void main(String[] args) {
        Caneta n1 = new Caneta();
        n1.modelo = "Compactor";
        n1.cor = "Preta";
        n1.ponta= 1.25f;
        n1.carga = 70;
        n1.status();
        n1.tampar();
        n1.destampar();
        n1.rabiscar();
  
        System.out.println(" ");
        
    }
}
   
