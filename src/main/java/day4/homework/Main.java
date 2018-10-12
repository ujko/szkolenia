package day4.homework;

public class Main {

    private int sum(int a, int b) {
        for( int i =1; i <= b; i++) {
            a++;
        }
        return a;
    }

    private int sum2(int a, int b){
        while(b>0) {
            a++;
            b--;
        }
        return a;
    }

    private int sum3(int a, int b) {
        if (b==0) {
            return a;
        }
        return sum3(++a, --b);
    }

    private int silnia(int a) {
        if(a==0) {
            return 1;
        }
        return a * silnia(a-1);
    }

    public static void main(String[] args) {
//        System.out.println(new Main().sum(4,3));
//        System.out.println(new Main().sum2(4,3));
//        System.out.println(new Main().sum3(4,3));
//        System.out.println(new Main().silnia(4));
        Util<Car> util = new Util<>();
        util.saveObject(new Car("Ford", "Black", 2));
        Util<Car> util2 = new Util<>();
        Car car = util2.openObject();
        System.out.println(car);
    }
}
