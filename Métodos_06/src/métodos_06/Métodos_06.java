package métodos_06;

public class Métodos_06 {

    public static void main(String[] args) {
// TODO code application logic here

String nome = "Maria Eduarda de Araújo Freire";
 int[] x= {2,0,2,0,1,9,0,1,0,0,1,6};
    x[0]=2;
    x[1]=0;
    x[2]=2;
    x[3]=0;
    x[4]=1;
    x[5]=9;
    x[6]=0;
    x[7]=1;
    x[8]=0;
    x[9]=0;
    x[10]=1;
    x[11]=6;
    
    System.out.println("→ Nome do discente: "+ nome);
        System.out.println("  ");
    System.out.println("→ Matrícula = 2020 -> Vetor = "+ x[0]+ "|"+ x[1]+"|"+x[2]+
"|"+x[3]+"|"+x[4]+"|"+x[5]+"|"+x[6]+"|"+x[7]+"|"+x[8]+"|"+x[9]+"|"+x[10]+"|"+x[11]);
       System.out.println("  ");
       
    ImprimeNomeDiscente();
    
       System.out.println("  ");

    System.out.println("→ Número da matrícula um por um em linhas diferentes: ");
        int tentei []= {6,1,0,0,1,0,9,1,0,2,0,2};
        int []ccc = ImprimeArray(tentei);
        for (int i=0; i<ccc.length; i++){
    System.out.println(ccc[i]);
}
       System.out.println("  "); 
       
    verificaMatricula(x);
}
    public static void ImprimeNomeDiscente (){
        String nome = "Maria Eduarda de Araújo Freire";
        System.out.println("→ O nome do discente é "+ nome);
}
    public static int[] ImprimeArray (int[] abc){
        int[] xyz =new int [abc.length];
        for (int i =0, j= xyz.length -1; i<abc.length; ++i,--j){
            
        xyz[j]= abc[i];
}
            return xyz;
}
    public static void verificaMatricula (int[]x){
        if (x[11]%2 ==0){
        System.out.println("→ Matrícula é par.");
        } else {
            System.out.println("→ Matrícula é ímpar.");
        }
    }
}
