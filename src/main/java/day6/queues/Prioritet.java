package day6.queues;

import java.util.LinkedList;
import java.util.List;

public class Prioritet {
    List<Integer> list = new LinkedList<>();
    int priority =0;

    private void pull(Integer addedInteger, boolean hasPriority) {

        list.add(addedInteger);
        if(hasPriority){
            priority=list.size()-1;
        }
    }

    private Integer pick() {
        Integer temp = list.get(priority);
        list.remove(priority);
        priority=0;
        return temp;
    }

    private void test() {
        pull(34,false);
        pull(46,false);
        pull(87,false);
        pull(57,true);
        pull(54,false);
        System.out.println(list);
        System.out.println(pick());
        System.out.println(pick());
        System.out.println(list);
    }

    public static void main(String[] args) {
        Prioritet priorytyTest = new Prioritet();
        priorytyTest.test();
    }
}
