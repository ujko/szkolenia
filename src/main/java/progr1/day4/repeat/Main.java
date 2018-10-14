package progr1.day4.repeat;

public class Main {

    public Main(){
        System.out.println("Konstruktor klasy Main");
    }
    static {
        System.out.println("Metoda statyczna klasy main");
    }
    {
        System.out.println("Metoda dynamiczna klasy main");
    }

    public static void main(String[] args) {
        new Main();
//        Main a;
    }
    public void sample(){
//        System.out.println("Krok 1");
//        int a = 0;
//        label:
//
//        if (a < 5) break label;
//        System.out.println(a++);

    }
}
