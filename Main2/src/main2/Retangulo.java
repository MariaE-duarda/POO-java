package main2;
public class Retangulo extends Forma {
    private double base;
    private double altura;
    
    @Override
    public double calculaArea(){
        double area;
        area = getBase() * getAltura();
        return area;
    }
    
    public void setBase(double base){
        this.base = base;
    }
    
    public double getBase(){
        return base;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getAltura(){
        return altura;
    }
}
