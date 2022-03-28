package model.bean;

/**
 *
 * @author Eduarda Araújo
 */
public class Categoria {
    private int id;
    private String descricao;

    public Categoria(){
    }

    public Categoria(String descricao) {
        this.descricao = descricao;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    } 

    public boolean salve(Categoria cat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
