package day6.homework;


import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class ArrayTest {
    private int[] intTable;

    private void createTable(int arraySize) {
        intTable = new int[arraySize];
    }

    private void fillTable() {
        Arrays.setAll(intTable, i -> new Random().nextInt(100));
//        Random ranfdomInt = new Random();
//        for (int i = 0; i<intTable.length; i++){
//            intTable[i] = ranfdomInt.nextInt(100);
//        }
    }

    private void printTable() {
        Arrays.stream(intTable).forEach(s -> System.out.print(s + ", "));
//        for (int i : intTable){
//            System.out.print(i +", ");
//        }
        System.out.println();
    }

    private void reverseTable() {
        int start = 0;
        int stop = intTable.length - 1;
        int tempInt;
        while (start < stop) {
            tempInt = intTable[start];
            intTable[start] = intTable[stop];
            intTable[stop] = tempInt;
            start++;
            stop--;
        }

    }

    private void printDividedBy3() {
//        for (int i :intTable){
//            if (i%3==0){
//                System.out.print(i+ ", ");
//            }
//        }
        System.out.println("Podzielne przez 3");
        Arrays.stream(intTable).filter(i -> i % 3 == 0).forEach(i -> System.out.print(i + ", "));
        System.out.println();
    }

    private void printIndexUser() {
        boolean flag = false;
        try {
            System.out.println("Wprowadz liczbe: ");
            Scanner scanner = new Scanner(System.in);
            int userNumber = scanner.nextInt();

            for (int i = 0; i < intTable.length; i++) {
                if (intTable[i] == userNumber) {
                    flag = true;
                    System.out.print(i + ", ");
                }

            }
        } catch (InputMismatchException e) {
            System.out.println("Wprowadz liczbe");

        }
        //flag jest boolean
        System.out.println(flag ? "" : "-1");
    }

    private void printDuplicated() {
        boolean flag = false;
        for (int i = 0; i < intTable.length; i++) {
            for (int j = i + 1; j < intTable.length; j++) {
                if (intTable[i] == intTable[j]) {
                    System.out.println("Jest duplikat: " + intTable[i]);
                    flag = true;
                }
            }

        }
        System.out.println(flag ? "" : "Brak duplikatów");
    }

    private void average() {
        Arrays.stream(intTable).average().ifPresent(s -> System.out.println(s));
        double sum = 0;
        for (int i : intTable) {
            sum += i;
        }
        System.out.println(sum / intTable.length);
    }

    private void nwd(int index1, int index2) {
        int n1 = intTable[index1];
        int n2 = intTable[index2];

        while (n1 != n2) {
            if (n1 > n2) {
                n1 -= n2;
            } else {
                n2 -= n1;
            }
        }
        System.out.println(n1);
    }

    private void testing(int arraySize) {
        createTable(arraySize);
        fillTable();
        printTable();
        printDividedBy3();
        reverseTable();
        printTable();
//        printIndexUser();
        printDuplicated();
        average();
        nwd(3, 5);

    }

    public static void main(String[] args) {
        ArrayTest arrayTest = new ArrayTest();
        int arg = 0;
        if (args.length < 1) {
            System.out.println("nie podałeś parametru");
        } else {
            try {
                arg = Integer.parseInt(args[0]);
            } catch (NumberFormatException n) {
                throw new IllegalArgumentException("Błędny formatparametru; podaj int >0");
            }
            if (arg <= 0) {
                throw new IllegalArgumentException("podaj parametr > 0 ");
            }
            arrayTest.testing(arg);
        }
    }
}
