package Seccion11Colecciones;

import Seccion10Arrays.ClasesPunto3.Gato;
import Seccion10Arrays.ClasesPunto3.Mascota;
import Seccion10Arrays.ClasesPunto3.Perro;

import java.util.ArrayList;
import java.util.List;

public class Punto1Mascotas {

    public static void main(String[] args) {
        // Creamos la lista de mascotas
        List<Mascota> mascotas = new ArrayList<>();

        // Agregamos mascotas a la lista
        mascotas.add(new Perro("Firulais"));
        mascotas.add(new Gato("Miaú"));
        mascotas.add(new Perro("Laika"));

        for (Mascota mascota : mascotas) {
            mascota.hacerRuido();
        }
    }

}
