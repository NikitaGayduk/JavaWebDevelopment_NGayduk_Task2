package by.epam.javawebtraining.gayduknikita.task2.collection;

import java.util.Arrays;

public class ArrayList implements List {

    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;

    private Object[] array;


    public ArrayList() {
        array = new Object[DEFAULT_CAPACITY];
    }

    public ArrayList(int capacity) {
        if (capacity > 0) {
            array = new Object[capacity];
        } else {
            array = new Object[DEFAULT_CAPACITY];
        }
    }

    public ArrayList(Collection collection) {
        array = collection.toArray();
    }


    @Override
    public boolean add(Object obj) {
        if (size >= array.length) {
            increaseCapacity();
        }
        array[size] = obj;
        size++;
        return true;
    }

    @Override
    public boolean addOn(int index, Object obj) {
        if (index < 0 || index > size) {
            return false;
        }
        if (size >= array.length) {
            increaseCapacity();
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = obj;
        size++;
        return true;
    }

    @Override
    public boolean addAll(Collection collection) {
        int requiredCapacity = collection.size() - (array.length - size);
        if (requiredCapacity > 0) {
            increaseCapacityOn(requiredCapacity);
        }
        System.arraycopy(collection.toArray(), 0, array, size, collection.size());
        size += collection.size();
        return true;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public Object replace(int index, Object obj) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Object result = array[index];
        array[index] = obj;
        return result;
    }

    @Override
    public boolean remove(int index) {
        if (index < 0 || index >= size) {
            return false;
        }
        System.arraycopy(array, index + 1, array, index, size - (index + 1));
        size--;
        array[size] = null;
        return true;
    }

    public void trimToSize() {
        array = Arrays.copyOf(array,size);
    }

    public void ensureCapacity(int requiredCapacity) {
        array = Arrays.copyOf(array,newCapacity(requiredCapacity));
    }

    @Override
    public int size() {
        return size;
    }

    private void increaseCapacity() {
        increaseCapacityOn(array.length + 1);
    }

    private void increaseCapacityOn(int requiredCapacity) {
        array = Arrays.copyOf(array, newCapacity(requiredCapacity));

    }

    private int newCapacity(int requiredCapacity) {
        int currentCapacity = array.length;
        int newCapacity = currentCapacity + (currentCapacity >> 1); //increase capacity on 50%
        return (requiredCapacity > newCapacity) ? requiredCapacity : newCapacity;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(array, size);
    }
}
