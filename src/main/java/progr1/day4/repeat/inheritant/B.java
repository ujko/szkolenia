package progr1.day4.repeat.inheritant;

public class B extends A {
    public B() {
        //super("Agnieszka");//super tylko jako pierwsza instrukcja, nie może być żadnej instrukcji przed nią

        super(); //uruchomienie konstruktora klasy nadrzędnej,
        // jak nie będzie tego super to i tak konstruktor z klasy nadrzędnej się uruchomi
        System.out.println("Jestem konstruktorem z klasy B");
    }

    public B(String name) {
        super(name);//przepisanie tego co dostajemy w konstruktorze klasy B, do klasy A
        System.out.println("Jestem konstruktorem z klasy B" + name);
    }
    public void methodB(String b){
        System.out.println("Jestem metodą z klasy B: "+b);

    }
}
