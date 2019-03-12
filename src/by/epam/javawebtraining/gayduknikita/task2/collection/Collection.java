package by.epam.javawebtraining.gayduknikita.task2.collection;

public interface Collection {
    boolean add(Object obj);

    boolean addAll(Collection collection);

    int size();

    boolean isEmpty();

    Object[] toArray();

}
