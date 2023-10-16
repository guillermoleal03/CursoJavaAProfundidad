package Seccion5POO_Clases.Mascotas;

public class Perros {

    private String raza;
    private String color;
    private Double peso;
    private Double altura;
    private String nombre;

    public Perros(String raza, String color, Double peso, Double altura, String nombre) {
        this.raza = raza;
        this.color = color;
        this.peso = peso;
        this.altura = altura;
        this.nombre = nombre;
    }

    public Perros(String nombre) {
        this.nombre = nombre;
    }

    public Perros(Double peso, Double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public Perros() {

    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
