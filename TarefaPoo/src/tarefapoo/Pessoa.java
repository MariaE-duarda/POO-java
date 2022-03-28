package tarefapoo;
import java.util.Date;
/**
 *
 * @author Eduarda Araújo
 */
public class Pessoa {
    private String nome;
    private Date dataAtual;
    private Date dataNascimento;
    
    public String getNome() {
        return nome;
    }
    
    public Date getDataAtual() {
        return dataAtual;
    }
    
    public Date getDataNascimento() {
        return dataNascimento;
    }
    
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public void setDataAtual (Date dataAtual) {
        this.dataAtual = dataAtual;
    }
    
    public void setDataNascimento (Date dataNascimento) throws DataFuturaException {
        if (dataNascimento.before(dataAtual)){
            this.dataNascimento = dataNascimento;
        } else {
            throw new DataFuturaException();
        }
    }
}

    
