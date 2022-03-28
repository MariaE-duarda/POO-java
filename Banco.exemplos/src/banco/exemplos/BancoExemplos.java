package banco.exemplos;

import java.util.Scanner;

public class ExemploRepeticao{
    public static void main (String [] args) {
        Scanner scan = novo Scanner (System.in);
        Faz{
            System.out.println ("Digite 1 para ...");
            System.out.println ("Digite 2 para ...");
            System.out.println ("Digite 3 para ...");            
            int opcao = scan.nextInt ();
            
            if (opcao == 5) {
                pausa;
            }
        } enquanto (verdadeiro);
        System.out.println ("FIM !!!");
    }
}