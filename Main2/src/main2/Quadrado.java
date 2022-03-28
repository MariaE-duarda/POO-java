package main2;
public class Quadrado extends Forma{
    private double lado;
    
    @Override
    public double calculaArea(){
        double area;
        area = getLado() * getLado();
        return area;
    }
    
    public void setLado(double lado){
        this.lado = lado;
    }
    
    public double getLado(){
        return lado;
    }
}
