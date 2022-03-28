package main3;

public class Main3 {
    public static void main(String[] args) {
        
    MeioDeTransporte c1 = new TransporteHibrido();
    c1.deslocamento("Catolé do Rocha", "Brejo do Cruz");
    TransporteHibrido th = (TransporteHibrido) c1;
    th.voar();
    th.navegar();
}
}