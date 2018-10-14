package progr1.day5.repeatGeneric;

public class Main {

    public void sampleTest(){
        Car<Mercedes> car = new Car<>(new Mercedes());
        System.out.println(car.getGenericType());
    }

    public void sampleTestCar2(){
        Car2<Integer> car2 = new Car2<>(13);
        car2.printSth();
        Car2<Mercedes> car3 = new Car2<>(new Mercedes());
        car3.printSth();
    }

    public void add (Car2<?> car){

    }

    public void sampleGeneric(){
        add(new Car2<Mercedes>());
        add(new Car2<String>());
        add(new Car2<Main>());
    }

    public static void main(String[] args) {
        //new Main().sampleTest();
        new Main().sampleTestCar2();

    }
}
