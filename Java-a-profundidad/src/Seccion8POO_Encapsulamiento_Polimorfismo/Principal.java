package Seccion8POO_Encapsulamiento_Polimorfismo;

import Seccion8POO_Encapsulamiento_Polimorfismo.ClasesHijas.Deportivo;
import Seccion8POO_Encapsulamiento_Polimorfismo.ClasesHijas.Sedan;

public class Principal {

    public static void main(String[] args) {
        Sedan sedan = new Sedan("Toyota", "Corolla", 2023, 0, "Blanco", 4);
        Deportivo deportivo = new Deportivo("Ferrari", "488 GTB", 2022, 0, "Rojo", 600);

        System.out.println(sedan);
        System.out.println();
        System.out.println(deportivo);
    }

}
