package atividadepoo;
/**
 *
 * @author Maria Eduarda de Araújo Freire
 */
public class DataFuturaException extends Exception {
    
    @Override
    public String getMessage (){
        return "Uma pessoa não pode possuir uma data de nascimento futura.";
    }
}
