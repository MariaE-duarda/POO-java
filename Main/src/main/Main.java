package main;
public class Main {

    public static void main(String[] args) {
       Servidor s1 = new Servidor("Maria",11111000);
       System.out.println(s1.getDescriçao());
       
       Servidor p1 = new Professor("João", 11111001);
       System.out.println(p1.getDescriçao());
       
       Servidor r1 = new Reitor("Bernado", 11111002);
       System.out.println(r1.getDescriçao());
    }
    
}
