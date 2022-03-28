package projetofinal_básicopoo;
public class ProjetoFinal_BásicoPOO {
    public static void main(String[] args) {
        // TODO code application logic here
        Video v[] = new Video[4];
        v[0] = new Video("Última aula de POO.");
        v[1] = new Video("Como se tornar um arquiteto de software.");
        v[2] = new Video("Como parar de ser trouxa.");
        v[3] = new Video("Fui jogar minecraft e olha no que deu rsrs.");
        
        Gafanhoto g[] = new Gafanhoto [2];
        g[0] = new Gafanhoto("Maria ", 18, "F", "Duda");
        g[1] = new Gafanhoto("João", 20, "M", "Keblinho");
        
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
        
        
        
        
        
    }
    
}
