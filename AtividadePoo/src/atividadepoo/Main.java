package atividadepoo;
/**
 * 
 * @author Maria Eduarda de Araújo Freire
*/
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa people = new Pessoa();
        people.setNome("Maria Eduarda");
        
        Calendar cOne = new GregorianCalendar();
        cOne.set(Calendar.DAY_OF_MONTH, 15);
        cOne.set(Calendar.MONTH, GregorianCalendar.DECEMBER);
        cOne.set(Calendar.YEAR, 2022);
        Date dataNascimento = cOne.getTime();
        try{
            people.setDataNascimento(dataNascimento);
        } catch (DataFuturaException dfe){
            System.out.println(dfe.getMessage());
        }
        
        System.out.println("Nome: " + people.getNome());
        System.out.println("Data de Nascimento: " + people.getDataNascimento());       
    }
}
