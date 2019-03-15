package by.epam.javawebtraining.gayduknikita.task2.collection;

public class LinkedList implements List {

    private int size = 0;

    private Node first;
    private Node last;

    private static class Node {
        Object element;
        Node prev;
        Node next;

        Node(Object element, Node prev, Node Next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

    }

    public LinkedList() {
    }

    public LinkedList(Collection collection) {
        this();
        this.addAll(collection);
    }

    private Node atIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node node;

        if (index < (size >> 1)) {
            node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = last;
            for (int i = size; i > index; i--)
                node = node.prev;
        }

        return node;
    }

    @Override
    public boolean add(Object obj) {
        Node newNode = new Node(obj, last, null);
        if (last != null) {
            last.next = newNode;
            newNode = last;
        } else {
            first = newNode;
            last = newNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean addOn(int index, Object obj) {
        try {
            Node tmp = atIndex(index);
            Node newNode = new Node(obj, tmp.prev, tmp);
            tmp.prev = newNode;
            newNode.prev.next = newNode;
            size++;
            return true;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
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
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Object[] toArray() {
        // TODO: 15.03.2019 start work here 
        Object[] result = new Object[size];
        
    }
}
