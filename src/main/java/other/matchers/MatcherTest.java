package other.matchers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherTest {

    /*
        regex
        .    dowolny znak
        \w   dowolna litera
        \d   dowolna cyfra
        *   wystąpienie 0 lub wiecej razy
        +   wystąpienie 1 lub więcej razy
        ?   wystąpienie 0 lub 1 razy
        \s  biały znak
        ()  grupa
        []  [0-3] cyfry od 0 do 3

     */


    private void test1() {
        Pattern pattern = Pattern.compile("ma");
        Matcher matcher = pattern.matcher("Ala ma kota");

        System.out.println(matcher.find());  //true
        System.out.println(matcher.matches());  //false
    }

    private boolean checkEmail(String email) {
        String m = ".+@.+\\.com.*";
        Pattern pattern = Pattern.compile(m);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

    public static void main(String[] args) {
//        new MatcherTest().test1();
        System.out.println(new MatcherTest().checkEmail("ujo.ujo@ujo.com.pl"));
    }
}
