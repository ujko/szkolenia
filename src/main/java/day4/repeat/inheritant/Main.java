package day4.repeat.inheritant;

public class Main {
    public static void main(String[] args) {
       // B b=new B();
       // B b= new B("konstruktor");
       // A b=new B();
        A a=new A();
        B b=new B();
        b.methodB("String b");
        b.methodA("String a");

        A aa=new B();
        aa.methodA("");
        ((B) aa).methodB("");//rzutowanie na klasę B

        B bb= (B) a;//rzutowanie możliwe tylko dlatego, że jedna klasa dziedziczy po drugiej
        bb.methodA("");
        bb.methodB("");

       // Abstr abstr=new InheritantAfter(); możliwe, bo ta klasa dziedziczy po klasie abstrakcyjnej
        Abstr abstr=new Abstr() {//można stworzyć obiekt, ale od razu jest konieczność implementacji metody
            @Override
            public void methodAbstr(String name) {

            }
        };

    }
}
