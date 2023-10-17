package Seccion10Arrays.ClasesPunto3;

public abstract class Mascota {

    protected String nombre;

    public Mascota(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void hacerRuido();

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

}
