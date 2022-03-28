
package aula.pkg09;
import java.util.Scanner;
public class Aula09 {

    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, n3, s1,s2,s3; 
        double media, média, soma, twodias;
        
        Scanner mm = new Scanner (System.in);
        n1 =8;
        n2=9; 
        n3 = 7; 
        
        media = (n1+ n2+ n3)/3;
        System.out.println("A média aritmética de 8,9 e 7: "+ media);
        
        s1= 4;
        s2= 5;
        s3= 6;
        
        média =(s1+s2+s3)/3;
        System.out.println("A média dos números 4, 5 e 6 é: " + média);
        
        soma= media +média;
        System.out.println("A soma entre as duas médias é: "+ soma);
        
        twodias = (media+média)/2;
        System.out.println("A média entre as duas médias: "+ twodias);
        
    }
    
}
