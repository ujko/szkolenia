package progr1.day5.repeatGeneric;

public class Car2<T> {
    private T t;

    public Car2() {
    }

    public Car2(T t) {
        this.t = t;
    }

    public void printSth(){
        if (t instanceof Mercedes){
             ((Mercedes) t).samplePrint();
        }else{
            System.out.println("To nie jest mercedes");
        }
    }
}
