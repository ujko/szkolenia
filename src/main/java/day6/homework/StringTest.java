package day6.homework;

public class StringTest {
    private String testowyString = "Kobcyłab ma mnały bok";

    private void palindrom() {
        String temp = testowyString.replace(" ", "");
        String tempReveset = new StringBuilder(temp).reverse().toString();
        System.out.println(temp.equalsIgnoreCase(tempReveset) ? "To jest palindrom" : "Nie jest palindrom");

    }

    private void printRepeatedLetters() {
        char[] myChar = testowyString.toCharArray();
        int result = 0;
        for (int i = 0; i < myChar.length - 1; i++) {
            if (myChar[i] == myChar[i + 1] - 1) {
                result++;
            }
        }
        System.out.println(result);
    }

    private void findLongestString() {
        String[] stringTab = testowyString.split(" ");
        int result = 0;
        String resultString = "";
        for (String s : stringTab) {
            if (result < s.length()) {
                result = s.length();
                resultString = s;
            }
        }
        System.out.println("Najdłuższy wyraz: " + resultString + ", jego długość " + result + " znaków.");
    }


    public static void main(String[] args) {
        StringTest stringTest = new StringTest();
        stringTest.palindrom();
        stringTest.printRepeatedLetters();
        stringTest.findLongestString();
    }
}
