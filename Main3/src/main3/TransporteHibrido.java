package main3;
public class TransporteHibrido implements MeioDeTransporte, Barco, Avião {

    @Override
    public void navegar() {
        System.out.println("O carro híbrido está navegando.");
    }

    @Override
    public void voar() {
        System.out.println("O carro híbrido está voando.");
    }

    @Override
    public void deslocamento(String nomeOrigem, String nomeDestino) {
        System.out.println("O carro vai de "+nomeOrigem+ " para "+nomeDestino+ ".");
    }


    
}
