package by.epam.javawebtraining.gayduknikita.task2.collection;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayListTest {
    ArrayList list;
    Object[] data = {new Object(), new Object(), new Object(), new Object()};

    private void fillListByData012(){
        list.add(data[0]);
        list.add(data[1]);
        list.add(data[2]);
    }

    @Before
    public void setList() {
        list = new ArrayList();
    }

    @Test
    public void addTest() {
        Object[] result = {data[0]};
        list.add(data[0]);
        assertArrayEquals(result, list.toArray());
    }

    @Test
    public void addOnTest() {
        Object[] result = {data[0], data[2], data[1]};
        list.addOn(0, data[0]);
        list.addOn(1, data[1]);
        list.addOn(1, data[2]);
        assertArrayEquals(result, list.toArray());
    }

    @Test
    public void addAllTest() {
        Object[] result = {data[0], data[1]};
        ArrayList list2 = new ArrayList();
        list2.add(data[0]);
        list2.add(data[1]);
        list.addAll(list2);
        assertArrayEquals(result, list.toArray());
    }

    @Test
    public void getTest() {
        Object result = data[1];
        fillListByData012();
        assertEquals(result, list.get(1));
    }

    @Test
    public void replaceTest() {
        Object[] result = {data[0], data[2], data[2]};
        fillListByData012();
        list.replace(1, data[2]);
        assertArrayEquals(result,list.toArray());
    }

    @Test
    public void removeTest() {
        Object[] result = {data[0], data[2]};
        fillListByData012();
        list.remove(1);
        assertArrayEquals(result,list.toArray());
    }

    @Test
    public void sizeTest() {
        fillListByData012();
        assertEquals(3,list.size());
        list.remove(0);
        assertEquals(2,list.size());
        list.add(data[0]);
        list.add(data[0]);
        assertEquals(4,list.size());
    }

    @Test
    public void isEmptyTest() {
        list.add(data[0]);
        assertEquals(false,list.isEmpty());
        list.remove(0);
        assertEquals(true,list.isEmpty());
    }

    @Test
    public void toArrayTest() {
        Object[] result = {data[0], data[1], data[2]};
        fillListByData012();
        assertArrayEquals(result,list.toArray());
    }
}