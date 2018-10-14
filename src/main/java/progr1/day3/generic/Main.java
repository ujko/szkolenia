package progr1.day3.generic;

import java.math.BigDecimal;

public class Main {

    private void sampleBook() {
        Book book = new Book();
        book.setTitle("Szczęki");
        String bookTitle = (String) book.getTitle();
        System.out.println(bookTitle);
        book.printTitle();

        Book<String> book2 = new Book();
        book2.setTitle("Dzieci kukurydzy");
        String bookTitle2 = book2.getTitle();
        book2.printTitle();

        Book<Cover> book3 = new Book<>();
        book3.setTitle(new Cover());
        book3.printTitle();
    }

    private void sampleCalculator() {
        Calculator<Integer> calcInteger = new Calculator<>(37);
        System.out.println(calcInteger.add(3));
        Calculator<Double> calcDouble = new Calculator<>(5.23);
        System.out.println(calcDouble.add(3d));
        Calculator<BigDecimal> calcBigDecimal = new Calculator<>(new BigDecimal(100));
        System.out.println(calcBigDecimal.add(new BigDecimal(50.5)));

        System.out.println("ODEJMOWANIE");

        System.out.println(calcInteger.subtract(3));
        System.out.println(calcDouble.subtract(3d));
        System.out.println(calcBigDecimal.subtract(new BigDecimal(50.5)));
    }

    private <T, S> T sampleGeneric(T something, S something1) {
        if (something instanceof Integer && something1 instanceof Integer) {
            // Rzutujemy typ T i S (something i something2) na typ Integer, następnie Integer na int (poprzez intValue(),
            // następnie dodajemy je używając "+" i całość rzutujemy na Integer
            // i następnie na typ zwracany T.
            System.out.println("Jestem z Integera");
            return (T) ((Integer) (((Integer) something).intValue() + ((Integer) something1).intValue()));
        }
        if (something instanceof Double && something1 instanceof Double) {
            Double a = (Double) something;
            Double b = (Double) something1;
            System.out.println("Jestem z Doubla");

            return (T) ((Double) (a + b));

        }

        return something;
    }
    private <T extends Person> T methodOfPerson(T person){
        if(person instanceof Student){
            person.someMethod("Student");
        }
        if(person instanceof Director){
            person.someMethod("Dyrektor");
        }
        if(person instanceof Teacher){
            person.someMethod("Nauczyciel");
        }
        return person;
    }
    private void sample5(){
        Student student=new Student();
        methodOfPerson(student);
        System.out.println(student);
    }

    public static void main(String[] args) {
        Main main = new Main();
//        main.sampleBook();
//        main.sampleCalculator();
        //System.out.println(main.sampleGeneric(12, 43));
       // System.out.println(main.sampleGeneric(12., 43.));
       // System.out.println(main.sampleGeneric(12., 43));

        main.sample5();


    }
}
