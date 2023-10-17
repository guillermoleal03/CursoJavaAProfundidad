package Seccion6POO_Herencia.ClasePadre;

public abstract class FiguraGeometrica {

    protected String color;

    public FiguraGeometrica(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calcularArea();

    //metodo a sobreescribir (punto 3)
    public String toString() {
        return "Figura geométrica de color " + color;
    }

}
