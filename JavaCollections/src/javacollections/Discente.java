package javacollections;
/**
 *
 * @author Maria Eduarda de Araújo Freire
 */
public class Discente {
    // requisito 1.2
    private String nome; 
    private int matricula; 

    // requisito 1.1
    public Discente(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }   
    
}
