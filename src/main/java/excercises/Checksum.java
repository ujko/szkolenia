package excercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Simple program who counting checksum
 */
public class Checksum {
    private int twice = 0;
    private int third = 0;

    public static void main(String[] args) {
//        List<String> ll = Arrays.asList("abcdef", "bababc", "abbcde", "abcccd", "aabcdd", "abcdee", "ababab");
        Checksum checksum = new Checksum();
//        ll.forEach(checksum::test);
//        System.out.println("Wynik: " + (checksum.twice * checksum.third));
        checksum.test3("duppa");
        checksum.test3("duppapa");
        checksum.test3("dupppa");

    }

    private void test(String s) {
        char[] a = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char b : a) {
            map.put(b, map.get(b) != null ? map.get(b) + 1 : 1);
        }
        List<Integer> ll = new ArrayList<>(map.values());
        if (ll.contains(2)) {
            twice++;
        }
        if (ll.contains(3)) {
            third++;
        }
    }

    private void test2(String s, int il) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        s = new String(a);
//        String regex = "(.)\\1\\1";
        String regex = "(.)\\1{"+il+"}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        System.out.println(matcher.find());

    }

    private void test3(String s) {
        String regex = "(.).*\\1.*\\1";
        Matcher matcher = Pattern.compile(regex).matcher(s);
        System.out.println(matcher.find());
    }
}
