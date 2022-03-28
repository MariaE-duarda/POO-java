package topico55_conjuntosfilas;
/**
 *
 * @author Maria Eduarda de Araújo Freire
 */

public class Docente {
    private int siape;
    private String nome;
 
    public Docente(int siape, String nome) {
        this.siape = siape;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSiape() {
        return siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }
    
    
}
