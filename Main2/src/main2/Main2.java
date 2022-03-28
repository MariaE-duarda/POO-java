package main2;

public class Main2 {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo();
        r1.setBase(7.9);
        r1.setAltura(3.3);
        System.out.println("Área do retangulo: "+ r1.calculaArea());
        
        Quadrado q1 = new Quadrado ();
        q1.setLado(6);
        System.out.println("Área do quadrado: "+ q1.calculaArea());
    }   

}
