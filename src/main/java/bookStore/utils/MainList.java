package bookStore.utils;

import java.lang.reflect.Array;

public class MainList<T> {
//    private T[] table = (T[]) new Object[0];
    Class<T> clazz;
    private T[] table = (T[]) Array.newInstance(clazz, 0);
    public void add(T item) {
        increaseTable();
        table[table.length - 1] = item;
    }

    private void increaseTable() {
        T[] tempTable = (T[]) Array.newInstance(clazz,table.length + 1);
        for (int i = 0; i < table.length; i++) {
            tempTable[i] = table[i];
        }
        table = tempTable;
    }
    public void remove (int index) {
        if(index >= table.length) {
            throw new IllegalArgumentException("No such item in the list");
        }
        int i = 0;
        int j = 0;
        T[] tempTable = (T[]) new Object[table.length-1];
        // TODO: trzeba dokonczyc petle FOR

    }

    public T getItem(int index) {
        return (T) table[index];
    }

    public T[] getTable() {
        return table;
    }
}
