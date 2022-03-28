package main;
public class Reitor extends Professor{

    public Reitor(String nome, int matricula) {
        super(nome, matricula);
    }

    /**
     *
     * @return
     */
    @Override
    public String getDescriçao(){
        String oServidor;
        oServidor = (getNome()+ " é um(a) reitor(a)");
        return oServidor;
    }
}
