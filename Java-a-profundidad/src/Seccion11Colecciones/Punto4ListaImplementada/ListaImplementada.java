package Seccion11Colecciones.Punto4ListaImplementada;

import java.util.*;

public class ListaImplementada implements List<Integer> {
    private ArrayList<Integer> elementos;

    public ListaImplementada() {
        this.elementos = new ArrayList<>();
    }

    @Override
    public int size() {
        return elementos.size();
    }

    @Override
    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return elementos.contains((Integer) o);
    }

    @Override
    public Iterator<Integer> iterator() {
        return elementos.iterator();
    }

    @Override
    public Object[] toArray() {
        return elementos.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return elementos.toArray(a);
    }

    @Override
    public boolean add(Integer e) {
        return elementos.add(e);
    }

    @Override
    public void add(int index, Integer element) {
        elementos.add(index, element);
    }

    @Override
    public Integer remove(int index) {
        return elementos.remove(index);
    }

    @Override
    public boolean remove(Object o) {
        return elementos.remove((Integer) o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        elementos.clear();
    }

    @Override
    public Integer get(int index) {
        return elementos.get(index);
    }

    @Override
    public Integer set(int index, Integer element) {
        return elementos.set(index, element);
    }

    @Override
    public int indexOf(Object o) {
        return elementos.indexOf((Integer) o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return elementos.lastIndexOf((Integer) o);
    }

    @Override
    public ListIterator<Integer> listIterator() {
        return elementos.listIterator();
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        return elementos.listIterator(index);
    }

    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        return elementos.subList(fromIndex, toIndex);
    }
}
