
package aula.pkg10_;

public class Aula10_ {

    public static void main(String[] args) {
      Celular fds = new Celular ();
      fds.marca = "Samsung";
      fds.modelo = "J4 Core";
      fds.cor = "Azul";
      fds.polegadas = 6.0f;
      fds.memoria = 16;
      fds.capinha = true;
      fds.usado = false;
      fds.ligado = false; 
      fds.status();
        System.out.println(" ");
      fds.ligar ();
    }
    
}
