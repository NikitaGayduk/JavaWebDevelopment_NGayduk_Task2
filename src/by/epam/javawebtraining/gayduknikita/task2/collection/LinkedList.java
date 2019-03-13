package by.epam.javawebtraining.gayduknikita.task2.collection;

public class LinkedList implements List {
    private int size = 0;

    @Override
    public boolean add(Object obj) {
        return false;
    }

    @Override
    public boolean addOn(int index, Object obj) {
        return false;
    }

    @Override
    public boolean addAll(Collection collection) {
        return false;
    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public Object replace(int index, Object obj) {
        return null;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }
}
