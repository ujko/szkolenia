package progr1.day2.zadania;


public class FooClass {
    protected String intToBinaryString(int someInt) {
        String s = "";
        if (someInt < 1) {
            return "0";
        }
        while (someInt > 0) {
            s = (someInt % 2) + s;
            someInt /= 2;
        }
        return s;
    }
}