package progr1.day6.queues;

import java.util.LinkedList;
import java.util.List;

public class Fifo {
    List<Integer> list = new LinkedList<>();

    private void pull(Integer addedInteger) {
        list.add(addedInteger);
    }

    private Integer pick() {
        Integer temp = list.get(0);
        list.remove(0);
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
        Fifo fifoTest = new Fifo();
        fifoTest.test();
    }
}
