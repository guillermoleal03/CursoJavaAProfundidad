package Seccion11Colecciones.Punto2LinkedListPropia;

public class Main {
    public static void main(String[] args) {
        // Creamos una lista ligada
        ListaLigada<Integer> lista = new ListaLigada<>();

        // Agregamos elementos a la lista
        lista.agregarAlInicio(1);
        lista.agregarAlFinal(2);
        lista.agregarAlInicio(3);

        lista.imprimir();

        System.out.println(lista.buscar(2)); // true

        lista.borrar(2);

        lista.imprimir();
    }
}
