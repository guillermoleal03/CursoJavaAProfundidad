package Seccion11Colecciones.Punto2LinkedListPropia;

public class ListaLigada<T> {

    private Nodo<T> cabeza;
    private Nodo<T> cola;

    public ListaLigada() {
        this.cabeza = null;
        this.cola = null;
    }

    // Agrega un elemento al principio de la lista
    public void agregarAlInicio(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);

        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevoNodo);
            cabeza = nuevoNodo;
        }
    }

    // Agrega un elemento al final de la lista
    public void agregarAlFinal(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);

        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(cola);
            cola = nuevoNodo;
        }
    }

    // Busca un elemento en la lista
    public boolean buscar(T dato) {
        Nodo<T> nodoActual = cabeza;

        while (nodoActual != null) {
            if (nodoActual.getDato().equals(dato)) {
                return true;
            }

            nodoActual = nodoActual.getSiguiente();
        }

        return false;
    }

    // Borra un elemento de la lista
    public void borrar(T dato) {
        Nodo<T> nodoActual = cabeza;
        Nodo<T> nodoAnterior = null;

        while (nodoActual != null) {
            if (nodoActual.getDato().equals(dato)) {
                if (nodoAnterior == null) {
                    cabeza = nodoActual.getSiguiente();
                } else {
                    nodoAnterior.setSiguiente(nodoActual.getSiguiente());
                }

                if (nodoActual.getSiguiente() == null) {
                    cola = nodoAnterior;
                } else {
                    nodoActual.getSiguiente().setAnterior(nodoAnterior);
                }

                return;
            }

            nodoAnterior = nodoActual;
            nodoActual = nodoActual.getSiguiente();
        }
    }

    // Imprime la lista
    public void imprimir() {
        Nodo<T> nodoActual = cabeza;

        while (nodoActual != null) {
            System.out.println(nodoActual.getDato());
            nodoActual = nodoActual.getSiguiente();
        }
    }
}