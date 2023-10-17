package Seccion6POO_Herencia.ClasesHijas;
import Seccion6POO_Herencia.ClasePadre.FiguraGeometrica;

public class Circulo extends FiguraGeometrica{
    protected double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    //metodo sobreescrito
    @Override
    public String toString() {
        return super.toString() + " con radio " + radio;
    }

}
