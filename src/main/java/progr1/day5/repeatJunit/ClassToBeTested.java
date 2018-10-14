package progr1.day5.repeatJunit;

public class ClassToBeTested {

    int addNumbers(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return addNumbers(++a, --b);
        }
    }

    int factorial(int a) {
        if(a < 0) {
            throw new IllegalArgumentException();
        }
        if (a == 0) {
            return 1;
        } else {
            return a * factorial(a - 1);
        }
    }
    String intToBinary(int a){
        String result = "";
        while (a>0){
            result = (a % 2) + result;
            a /= 2;
        }
        return result;
    }
}
