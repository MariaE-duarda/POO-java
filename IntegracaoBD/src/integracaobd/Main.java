package integracaobd;

import java.sql.*;
/**
 *
 * @author Maria Eduarda de Araujo Freire
 */
public class Main {
    
    public Connection conectar(){
        Connection conexao = null;
        try{ 
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/escola", "Eduarda", "202019010016");
            System.out.println("Conectado");
        }catch (ClassNotFoundException ex){
            System.out.println("Não encontrou o driver do BD.");
        }catch (SQLException sqlEx){
            System.out.println("Não conectou ao BD.");
        }
        return conexao;
    }
    
    public void desconectar(Connection conexao){
        try{
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
                System.out.println("Desconectou do BD.");               
            }
        }catch(SQLException sqlEx){
            System.out.println("Não conseguiu conectar ao BD.");
        }       
    }
    
    public void consultar() {
        Connection conexao = conectar();
        try{
            String sql = "SELECT * FROM discente WHERE matricula = 19010016";
            Statement s = conexao.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while(rs.next()){
                System.out.println("- " + rs.getLong("matricula"));
                System.out.println("- " + rs.getString("nome"));
            }
        }catch(SQLException sqlEx){
            System.out.println("Não conseguiu consultar.");
        }finally{
            desconectar(conexao);
        }
    }
    
    public boolean manipularBD(String sql){
        Connection conexao = conectar();
        try{
            Statement s = conexao.createStatement();
            s.execute(sql);
            return true;
        }catch(SQLException ex){
            return false;
        }finally{
            desconectar(conexao);
        }
    }
    
    public void inserir(){
        String sql = "INSERT INTO discente VALUES (19010016, 'Maria Eduarda de Araujo')";
        if (manipularBD(sql)){
            System.out.println("\n \nInseriu o discente no BD.");
        }else {
            System.out.println("\n \nNão foi possível inserir o discente no BD.");
        }                 
    }
    
    public void alterar(){
        String sql = "UPDATE discente SET nome = 'Maria Eduarda de Araujo Freire' WHERE matricula = 19010016";
        if(manipularBD(sql)){
            System.out.println("\n \nAlterou o discente no BD");
        }else {
            System.out.println("\n \nNão foi possível alterar o discente no BD.");
        }        
    }
    
    public void excluir(){
        String sql = "DELETE FROM discente WHERE matricula = 19010016";
        if(manipularBD(sql)){
            System.out.println("\n \nRemoveu o discente do BD.");
        }else{
            System.out.println("\n \nNão foi possível excluir o discente do BD.");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Main a = new Main();
        a.inserir();
        a.alterar();
        a.excluir();
    }
    
}
