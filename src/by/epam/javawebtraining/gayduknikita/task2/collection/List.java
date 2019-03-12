package by.epam.javawebtraining.gayduknikita.task2.collection;

public interface List extends Collection {

    boolean addOn(int index, Object obj);

    Object get(int index) throws IndexOutOfBoundsException;

    Object replace(int index, Object obj);

    boolean remove(int index);
}
