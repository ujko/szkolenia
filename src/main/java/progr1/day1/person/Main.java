package progr1.day1.person;

public class Main {
    private void sample() {
        Person person1 = new Person("Jaś", "Kowalski", 3, Gender.MALE);
        Person person2 = new Person("Jaś", "Kowalski", 50, Gender.MALE);
        Person person3 = new Person("Jaś", "Bednarek", 50, Gender.MALE);
        Person person4 = null;

        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
        System.out.println(person1.equals(person4));
        //Checksum działania
        assertEquals(person1.equals(person2), false);
        //toString
        System.out.println(person1);
    }

    private void sample2() {
        String a = "Jas";
        String b = "Jas";
        String c = new String("Jas");

        System.out.println(a==b);  //true
        System.out.println(a==c);  //false
        System.out.println(a.equals(c)); //true
        System.out.println(a.intern()==b.intern()); //true
    }

    private void assertEquals(Object o1, Object o2) {
        if (o1.equals(o2)) {
            System.out.println("Program działa poprawnie");
        } else {
            System.out.println("Program nie działa popranie");
        }
    }

    private void testStringBuilder() {
        String a = "progr1.day1.test: ";
        StringBuilder b = new StringBuilder(a);
        int maxIteration = 10;
        for (int i = 1; i <= maxIteration; i++) {
//            a=a+i+", ";
            b.append(i).append(", ");
        }
        System.out.println(b);
    }

    private boolean testInt(int a) {
        return a > 5 ? true : false;
    }

    private void shortIf(int a) {
//        if(a>5){
//            System.out.println("tak");
//        }else{
//            System.out.println("nie");
//        }
        System.out.println(a > 5 ? "tak" : "nie");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.sample();
        main.testStringBuilder();
        System.out.println(main.testInt(3));
        main.shortIf(6);
        main.sample2();

        PseudoGender pseudoGender = PseudoGender.FEMALE;
        System.out.println(pseudoGender.getGender());
        System.out.println("*********");
        Gender2 gender1 = Gender2.getInstance();
        Gender2 gender2 = Gender2.getInstance();
        gender1.setName("David");
        gender2.setName("Pawel");
        System.out.println(gender1.getName() + ":" + gender2.getName());

        Person person1 = new Person();
        Person person2 = new Person();
        person1.setFirstName("Gavid");
        person2.setFirstName("Tomek");
        System.out.println(person1.getFirstName() + ":" + person2.getFirstName());
        System.out.println("********");
        System.out.println(gender1.equals(gender2));
        System.out.println(gender1 == gender2);
        System.out.println("*********");
        System.out.println(person1.equals(person2));
        System.out.println(person1 == person2);

    }
}
