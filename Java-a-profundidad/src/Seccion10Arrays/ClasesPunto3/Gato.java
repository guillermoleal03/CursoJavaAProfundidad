package Seccion10Arrays.ClasesPunto3;

public class Gato extends Mascota{

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerRuido() {
        System.out.println("Miau!");
    }

}
