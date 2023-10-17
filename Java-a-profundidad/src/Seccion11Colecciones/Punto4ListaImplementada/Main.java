package Seccion11Colecciones.Punto4ListaImplementada;

public class Main {

    public static void main(String[] args) {
        ListaImplementada lista = new ListaImplementada();

        lista.add(1);
        lista.add(2);
        lista.add(3);

        for (Integer elemento : lista) {
            System.out.println(elemento);
        }
    }

}
