
package projetofinal_básicopoo;
public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.totAssistido = 0; 
        this.login = login;
    }
    
    public void viuMaisUm(){
        
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() +"login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
}

//Extende a classe abstrata Pessoa (Herança);
