package progr1.day5.classInClass;

public class Main {
    public static void main(String[] args) {
//        new Main().sampleStaticClass();
        new Main().sampleDynamicClass();
    }

    private void sampleStaticClass() {
        OneMoreClass.SecondStaticClass.staticPublicCC = 50;
        OneMoreClass.SecondStaticClass.methodStatic();
        OneMoreClass.SecondStaticClass secondStaticClass = new OneMoreClass.SecondStaticClass();
        secondStaticClass.methodInStaticClass();
        OneMoreClass.SecondStaticClass.methodStatic();
    }

    private void sampleDynamicClass() {
        OneMoreClass oneMoreClass = new OneMoreClass();
        OneMoreClass.SecondDynamicClass secondDynamicClass = oneMoreClass.new SecondDynamicClass(); //Tworzenie objektu clasy wewnetrznej dynamicznej.
        secondDynamicClass.dynamicPublicBB += 11;
        System.out.println(secondDynamicClass.dynamicPublicBB);
        secondDynamicClass.methodPrint();
    }
}
