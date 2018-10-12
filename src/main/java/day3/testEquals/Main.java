package day3.testEquals;

import java.util.ArrayList;
import java.util.List;

public class Main {

    List<String> listOfStrings=new ArrayList<>();
    String word="9999937start";

    private void createList(){
        int maxValue=10000000;
        String slowo="start";

        for(int i=0;i<=maxValue;i++){
            listOfStrings.add(i+slowo);
        }
    }

    private void test1(){
        long start=System.currentTimeMillis();
        long stop=0;

        for(String slowo:listOfStrings){
            if(slowo==word){
            stop=System.currentTimeMillis();
            break;
            }
        }
        System.out.println("== " +(stop-start));
    }
    private void test2(){
        long start=System.currentTimeMillis();
        long stop=0;

        for(String slowo:listOfStrings){
            if(slowo.equals(word)){
                stop=System.currentTimeMillis();
                break;
            }
        }
        System.out.println("EQUALS: " +(stop-start));
    }
    private void test3(){
        long start=System.currentTimeMillis();
        long stop=0;

        for(String slowo:listOfStrings){
            if(slowo.intern()==word.intern()){
                stop=System.currentTimeMillis();
                break;
            }
        }
        System.out.println("INTERN: " +(stop-start));
    }

    public static void main(String[] args) {
        Main main=new Main();
        main.createList();
        main.test1();
        main.test2();
        main.test3();
    }
}
