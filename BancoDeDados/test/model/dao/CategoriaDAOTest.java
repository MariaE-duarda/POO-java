package model.dao;

import model.bean.Categoria;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Eduarda Araújo
 */
public class CategoriaDAOTest {
    
    public CategoriaDAOTest() {
    }

    @Test
    public void inserir() {
        
        Categoria cat = new Categoria("Roupas");
        Categoria dao = new Categoria();
        
        if(dao.salve(cat)){
            System.out.println("Salvo com sucesso!");
        }else {
            fail("Erro ao salvar.");
        }
    }
    
}
