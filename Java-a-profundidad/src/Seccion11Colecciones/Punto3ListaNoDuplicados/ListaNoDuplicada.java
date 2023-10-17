package Seccion11Colecciones.Punto3ListaNoDuplicados;

import java.util.HashSet;
import java.util.Set;

public class ListaNoDuplicada<T> {

    private Set<T> elementos;

    public ListaNoDuplicada() {
        this.elementos = new HashSet<>();
    }

    // Agrega un elemento a la lista
    public void agregar(T elemento) {
        if (!elementos.contains(elemento)) {
            elementos.add(elemento);
        }
    }

    // Borra un elemento de la lista
    public void borrar(T elemento) {
        elementos.remove(elemento);
    }

    // Busca un elemento en la lista
    public boolean buscar(T elemento) {
        return elementos.contains(elemento);
    }

    // Imprime la lista
    public void imprimir() {
        for (T elemento : elementos) {
            System.out.println(elemento);
        }
    }
}