package Seccion6POO_Herencia.ClasesHijas;
import Seccion6POO_Herencia.ClasePadre.FiguraGeometrica;
public class Cuadrado extends FiguraGeometrica {

    protected double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

}
