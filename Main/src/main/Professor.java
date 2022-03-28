package main;
public class Professor extends Servidor {

    public Professor(String nome, int matricula) {
        super(nome, matricula);
    }

    /**
     *
     * @return
     */
    @Override
    public String getDescriçao(){
        String oServidor;
        oServidor = (getNome()+ " é um(a) professor(a)");
        return oServidor;
    }
    
    
}
