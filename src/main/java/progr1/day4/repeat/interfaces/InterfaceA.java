package progr1.day4.repeat.interfaces;

public interface InterfaceA {
    String a="a";
    public void methodA(String a);//metody niedefaultowe są bez ciała metody
    default void methodB(String b){
        System.out.println("String b z metody defaultowej");//metody defaultowe posiadają ciało
    }
    //void methodC(); metoda 'abstrakcyjna' może być tylko 1 w interfejsie, jeżeli chcemy wykorzystać lambdę
}
