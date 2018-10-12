package day4.collections;

import java.util.*;

public class MainUtilsSets {
    public void sampleTreeSet(int size){
        Set<Integer> collection = new TreeSet<>();
        for (int i = 0; i < size; i++){
            int a = new Random().nextInt(1000);
            System.out.print(a + ", ");
            collection.add(a);
        }
        System.out.println();
        Utils.printCollection(collection);
    }

    public void sampleHashSet(int size){
        Set<Integer> collection = new HashSet<>();
        for (int i = 0; i < size; i++){
            int a = new Random().nextInt(1000);
            System.out.print(a + ", ");
            collection.add(a);
        }
        System.out.println();
        Utils.printCollection(collection);
    }

    public void sampleLinkedHashSet(int size){
        Set<Integer> collection = new LinkedHashSet<>();
        for (int i = 0; i < size; i++){
            int a = new Random().nextInt(1000);
            System.out.print(a + ", ");
            collection.add(a);
        }
        System.out.println();
        Utils.printCollection(collection);
    }


    public static void main(String[] args) {
//        new MainUtilsSets().sampleTreeSet(30);
//        new MainUtilsSets().sampleHashSet(30);
        new MainUtilsSets().sampleLinkedHashSet(30);
    }
}
