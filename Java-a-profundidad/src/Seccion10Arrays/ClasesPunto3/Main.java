package Seccion10Arrays.ClasesPunto3;

public class Main {

    public static void main(String[] args) {
        Mascota[] mascotas = new Mascota[3];

        mascotas[0] = new Perro("Firulais");
        mascotas[1] = new Gato("Miaú");
        mascotas[2] = new Perro("Laika");

        for (Mascota mascota : mascotas) {
            mascota.hacerRuido();
        }
    }

}
