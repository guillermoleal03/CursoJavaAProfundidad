package Seccion10Arrays.ClasesPunto3;

public class Perro extends Mascota{

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerRuido() {
        System.out.println("Guau!");
    }

}
