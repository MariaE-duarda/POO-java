package tarefapoo;
/**
 * 
 * @author Eduarda Araújo
*/
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa p1 = new Pessoa();
        p1.setNome("Anna");
        
        Calendar c1 = new GregorianCalendar();
        Date dataAtual = c1.getTime();
        p1.setDataAtual(dataAtual);
        
        Calendar c2 = new GregorianCalendar();
        c2.set(Calendar.DAY_OF_MONTH, 31);
        c2.set(Calendar.MONTH, GregorianCalendar.DECEMBER);
        c2.set(Calendar.YEAR, 2025);
        Date dataNascimento = c2.getTime();
        try{
            p1.setDataNascimento(dataNascimento);
        } catch (DataFuturaException dfe){
            System.out.println(dfe.getMessage());
        }
        
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Data de Nascimento: " + p1.getDataNascimento());       
    }
}
