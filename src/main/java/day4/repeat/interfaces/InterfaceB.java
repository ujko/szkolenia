package day4.repeat.interfaces;

public interface InterfaceB {
    default void methodB(String b){
        System.out.println("String b z metody defaultowej");//metody defaultowe posiadają ciało
    }
}
