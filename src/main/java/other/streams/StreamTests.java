package other.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTests {

    public static void main(String[] args) {
//        new StreamTests().oldStringConcat();
//        new StreamTests().streamWithSingleType();
//        new StreamTests().streamWithMultipleTypes();
//        new StreamTests().streamOfInts();
        new StreamTests().lazyAndSort();
    }

    private void oldStringConcat() {
        String[] table = {"uroeo", "fdsfds", "dfsdfs", "fsdfsd"};
        StringBuilder builder = new StringBuilder();
        String endMark = "";
        for (String s : table) {
            builder.append(endMark);
            builder.append(s,0,3);
            endMark = ", ";
        }
        System.out.println(builder.toString());
    }

    private void streamWithSingleType() {
        Stream<String> initStream = Stream.of("uroeo", "fdsfds", "dfsdfs", "fsdfsd");
        Stream<String> middleStream = initStream.map(s -> s.substring(0, 3));
        String result = middleStream.collect(Collectors.joining(", "));
        System.out.println(result);
    }

    private void streamWithMultipleTypes() {
        Stream<String> initStream = Stream.of("uroeo", "fdsfds", "dfsdfs", "fsdfsd");
        Stream<Integer> middleStream = initStream.map(String::length);
        Integer result = middleStream.reduce((x, y) -> x + y).get();
        System.out.println(result);
    }

    private void streamOfInts() {
        Stream<String> initStream = Stream.of("uroeo", "fdsfds", "dfsdfs", "fsdfsd");
        IntStream middleStream = initStream.mapToInt(String::length);
        int result = middleStream.sum();
        System.out.println(result);
    }

    private void streamCreating() throws IOException {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Integer[] array = new Integer[3];
//        Stream<Integer> stream = Stream.of(1, 2, 3);
//        Stream<Integer> stream = Arrays.stream(array);
//        Stream<Integer> stream = list.stream();
//        Stream<Integer> stream = set.stream();
//        Stream<Integer> stream = Stream.<Integer>builder().add(1).add(2).add(3).build();
//        Stream<Integer> stream = Stream.generate(() -> 42).limit(5);
//        Stream<Integer> stream = Stream.iterate(0, x -> x + 1).limit(5);
//        Stream<Integer> stream = Stream.empty();
//        Stream<String> stream = Pattern.compile(", ").splitAsStream("1, 2, 3, 4, 5");
//        Stream<String> stream = Files.lines(Paths.get("file.txt"));

//        IntStream stream = IntStream.range(0, 10);
//        IntStream stream = IntStream.rangeClosed(0, 10);
//        IntStream stream = new Random().ints(5);
//        DoubleStream stream = new Random().doubles(5);
//        IntStream stream = "qwerty".chars();
    }


    private void lazyAndSort() {
        Stream<String> stream = Stream.of("a", "i", "f", "e", "j", "d", "c", "b", "h", "g")
                .skip(2)
                .filter(x -> x.charAt(0) % 2 ==0)
                .peek(x -> System.out.println("Before: " + x))
                .map(x -> "char-" + x)
                .limit(4)
                .sorted()
                .peek(x -> System.out.println("After: " + x))
                .sorted()
                ;
        stream.forEach(System.out::println);

    }
}
