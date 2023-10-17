package Seccion8POO_Encapsulamiento_Polimorfismo.ClasesHijas;

import Seccion8POO_Encapsulamiento_Polimorfismo.ClasePadre.Automovil;

public class Deportivo extends Automovil {

    private int potencia;

    public Deportivo(String marca, String modelo, int anio, int kilometraje, String color, int potencia) {
        super(marca, modelo, anio, kilometraje, color);
        this.potencia = potencia;
    }

    @Override
    public double calcularPrecio() {
        return 200000 * potencia;
    }

    @Override
    public String toString() {
        return "Deportivo{" +
                "potencia=" + potencia +
                "} " + super.toString();
    }

}
