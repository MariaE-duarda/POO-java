package tarefapoo;
/**
 *
 * @author Eduarda Araújo
 */
public class DataFuturaException extends Exception{
    
    @Override 
    public String getMessage (){
        return "Uma pessoa não pode possuir uma data de nascimento futura.";
    }
}
