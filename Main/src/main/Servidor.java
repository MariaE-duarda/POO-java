package main;
public class Servidor {
    private String nome; 
    private int matricula;
    
    public Servidor  (String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }
    public String getDescriçao(){
        String oServidor;
        oServidor = (getNome()+" é um(a) servidor(a)");
        return oServidor;
    }
    
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public String getNome (){
        return nome;
    }
    
    public void setMatricula (int matricula){
        this.matricula = matricula;
    }
    
    public int getMatricula (){
        return matricula;
    }
    
    
}
