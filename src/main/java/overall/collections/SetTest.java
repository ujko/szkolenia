package overall.collections;

import java.util.*;
import java.util.stream.Collectors;

public class SetTest {
    private Set<Integer> numbers = new HashSet<>();


    private void uniqueNumbers(List<Integer> list) {
        System.out.println(list);
        Set<Integer> uniqueNumbers = new HashSet<>(list);
        System.out.println(uniqueNumbers);
    }

    private void uniqueOddNumbers(List<Integer> list) {
        Set<Integer> uniqueOddNumbers = list.stream()
                .filter(s -> s % 2 != 0)
                .collect(Collectors.toSet());
        System.out.println(uniqueOddNumbers);
    }

    private void iterateTest(Set<String> names) {
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }

    private void searchingElement(Set<String> names) {
        if (names.contains("Mary")) {
            System.out.println("Found Mary");
        }
    }

    private void subSet() {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(20, 56, 89, 31, 8, 5));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(8, 89));

        if (s1.containsAll(s2)) {
            System.out.println("s2 is a subset of s1");
        }
    }

    private void union() {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 3, 5, 7, 9));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(2, 4, 6, 8));
        System.out.println("s1 before union: " + s1);
        s1.addAll(s2);
        System.out.println("s1 after union: " + s1);
    }

    private void intersection() {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 7, 9));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(2, 4, 6, 8));
        System.out.println("s1 before intersection: " + s1);
        s1.retainAll(s2);
        System.out.println("s1 after intersection: " + s1);
    }

    private void difference() {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 7, 9));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(2, 4, 6, 8));
        System.out.println("s1 before difference: " + s1);
        s1.removeAll(s2);
        System.out.println("s1 after difference: " + s1);
    }

    private void threadSafe() {
        Set<Integer> numbers = Collections.synchronizedSet(new HashSet<Integer>());
        synchronized (numbers) {
            Iterator<Integer> iterator = numbers.iterator();

            while (iterator.hasNext()) {
                Integer number = iterator.next();
                System.out.println(number);
            }
        }
    }

    private void collections() {
        /*
        checkedSet(): Returns a dynamically typesafe view of the specified set.
        checkedSortedSet(): Returns a dynamically typesafe view of the specified sorted set.
        emptySet(): Returns the empty set (immutable).
        singleton(): Returns an immutable set containing only the specified object.
        unmodifiableSet(): Returns an unmodifiable view of the specified set.
        unmodifiableSortedSet(): Returns an unmodifiable view of the specified sorted set.*/
    }

    private void test() {
        List<Integer> list = Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8, 6);
        uniqueNumbers(list);
        uniqueOddNumbers(list);
        Set<String> names = new HashSet<>();
        names.add("Tom");
        names.add("Mary");
        names.add("Peter");
        names.add("Alice");
        iterateTest(names);
        searchingElement(names);
        subSet();
        union();
        intersection();
        difference();
    }

    public static void main(String[] args) {
        new SetTest().test();
    }

}
