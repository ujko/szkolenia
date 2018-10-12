package day5.repeatGeneric;

public class Car<T extends CarInterface> {
    private CarInterface genericType;

    public void sampleCar(){
        genericType.samplePrint();
    }

    public Car(T genericType) {
        this.genericType = genericType;
    }

    public CarInterface getGenericType() {
        return genericType;
    }
}
