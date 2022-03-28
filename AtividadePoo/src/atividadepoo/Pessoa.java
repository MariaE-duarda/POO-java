package atividadepoo;
/**
 *
 * @author Maria Eduarda de Araújo Freire
 */
import java.util.Date;
public class Pessoa {
    private String nome;
    private Date dataNascimento;
    
    Date dataAgora = new Date ();
    
    public String getNome() {
        return nome;
    }
    
    public Date getDataNascimento() {
        return dataNascimento;
    }
    
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public void setDataNascimento (Date dataNascimento) throws DataFuturaException {
        if (dataNascimento.before(dataAgora)){
            this.dataNascimento = dataNascimento;
        } else {
            throw new DataFuturaException();
        }
    }
}