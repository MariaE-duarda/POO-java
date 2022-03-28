package aula.de.revisão_00;
public class AulaDeRevisão_00 {
    public static void main(String[] args) {
        Estojo_Escolar p1 = new Estojo_Escolar();
        p1.cor = "Preta"; 
        p1.Marca = "Capricho";
        p1.Bolsos = 2;
        p1.Materiais = "Dentro da bolsa encontram-se: Lápis, Canetas, Borrachas, Lapiseiras e Marca-textos.";
        p1.Aberta = false;
        p1.Status ();
        p1.ABrir();
        
    }
    
}
