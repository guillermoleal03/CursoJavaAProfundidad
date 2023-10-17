package Seccion8POO_Encapsulamiento_Polimorfismo.ClasesHijas;

import Seccion8POO_Encapsulamiento_Polimorfismo.ClasePadre.Automovil;

public class Sedan extends Automovil {

    private int numeroPuertas;

    public Sedan(String marca, String modelo, int anio, int kilometraje, String color, int numeroPuertas) {
        super(marca, modelo, anio, kilometraje, color);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public double calcularPrecio() {
        return 100000 * numeroPuertas;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "numeroPuertas=" + numeroPuertas +
                "} " + super.toString();
    }

}
