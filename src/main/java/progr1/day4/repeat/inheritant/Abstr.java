package progr1.day4.repeat.inheritant;

public abstract class Abstr {

    protected String a;

    public void methodWriteA(){
        System.out.println("Wypisuję: "+a);
    }
    public abstract void methodAbstr(String name);//metoda abstrakcyjna bez ciała
    // -wymuszenie jej implementacji na klasie dziedziczącej
}
