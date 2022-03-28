package aula.pkg02;
public class Aula03{
    public static void main(String[] args) {
        Caneta c1 = new Caneta ();
        c1.modelo = "Compactor";
        c1.cor = "Preta";
        //c1.ponta = 0,75f;
        c1.carga = 75; 
        //c1.tampada = false;
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
     
 }
