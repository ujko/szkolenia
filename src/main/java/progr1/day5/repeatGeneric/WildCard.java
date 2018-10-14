package progr1.day5.repeatGeneric;

public class WildCard {
    class Employee<S> {}
    interface A {}
    interface B extends A{}
    interface C extends B{}

    void add (Employee<?> employee) {    }
    void add1 (Employee<? extends B> employee) {    } // ogranicza nas do klas dziedziczących
    void add2 (Employee<? super B> employee) {    } // ogranicza nas do klas, z których dziedziczymy

    void test (){
        add(new Employee<A>());
        add(new Employee<B>());
        add(new Employee<C>());

      //  add1(new Employee<A>());
        add1(new Employee<B>());
        add1(new Employee<C>());

        add2(new Employee<A>());
        add2(new Employee<B>());
       // add2(new Employee<C>());
    }
}
