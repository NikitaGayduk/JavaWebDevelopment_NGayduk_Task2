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
        if(capacity > 0){
            array = new Object[capacity];
        } else {
            array = new Object[DEFAULT_CAPACITY];
        }
    }

    public ArrayList(Collection collection){
        array = collection.toArray();
    }



    @Override
    public boolean add(Object obj) {
        if(size >= array.length){
            //increaseCapacity();
        }
        array[size] = obj;
        size++;
        return true;
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

    private void increaseCapacity(){

    }

    private void increaseCapacityOn(int requered){

    }

    private int newCapacity(int requered){
        int currentCapacity = array.length;
        int newCapacity = currentCapacity + (currentCapacity>>1); //increase capacity on 50%
        if(required > )

    }

    @Override
    public boolean isEmpty() {
        return size > 0;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(array,size);
    }
}
