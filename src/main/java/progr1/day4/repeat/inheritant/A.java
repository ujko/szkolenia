package progr1.day4.repeat.inheritant;

public class A {
    public A() {
        System.out.println("Jestem konstruktorem z klasy A");
    }

    public A(String name) {
        System.out.println("Jestem konstruktorem z klasy A przyjmującym Stringa: " + name);
    }

    public void methodA(String a){
        System.out.println("Metoda z klasy A "+a);
    }
   // public abstract void methodAbstract(String a);  metoda abstrakcyjna tylko w klasie abstrakcyjnej
}
