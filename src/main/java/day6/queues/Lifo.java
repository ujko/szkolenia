package day6.queues;

import java.util.LinkedList;
import java.util.List;

public class Lifo {
    List<Integer> list = new LinkedList<>();

    private void pull(Integer addedInteger) {
        list.add(addedInteger);
    }

    private Integer pick() {
        int lastIndex = list.size() - 1;
        Integer temp = list.get(lastIndex);
        list.remove(lastIndex);
        return temp;
    }

    private void test() {
        pull(34);
        pull(46);
        pull(87);
        pull(57);
        pull(54);
        System.out.println(list);
        System.out.println(pick());
        System.out.println(pick());
        System.out.println(list);


    }

    public static void main(String[] args) {
        Lifo lifoTest = new Lifo();
        lifoTest.test();
    }
}
