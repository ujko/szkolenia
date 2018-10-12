package day4.repeat.interfaces;

import day4.repeat.inheritant.Main;

public class MainForInterface {
    public static void main(String[] args) {
//        InterfaceA interfaceA=new InterfaceA() {
//            @Override
//            public void methodA(String a) {
//                System.out.println(a);
//            }
//        };
        InterfaceA interfaceA=(a)-> System.out.println(a); //lambda, to samo co powyżej
        interfaceA.methodA("String z metody A");

    }
}
