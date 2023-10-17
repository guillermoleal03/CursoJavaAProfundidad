package Seccion11Colecciones.Punto3ListaNoDuplicados;

public class Main {

    public static void main(String[] args) {
        ListaNoDuplicada<Integer> lista = new ListaNoDuplicada<>();

        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);

        lista.imprimir();

        System.out.println(lista.buscar(2)); // true

        lista.borrar(2);

        lista.imprimir();
    }

}
