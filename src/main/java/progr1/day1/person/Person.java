package progr1.day1.person;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private int age;
    private String firstName;
    private String lastName;
    private Gender gender;

    public Person() {
    }

    public Person(String firstName, String lastName, int age, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null) {
//            return false;
//        }
//        Person person = (Person) o;
//        if (age != person.age) {
//            return false;
//        }
//        if (!lastName.equals(person.lastName)) {
//            return false;
//        }
//        if (!firstName.equals(person.firstName)) {
//            return false;
//        }
//        return true;
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null) {
//            return false;
//        }
//        Person person = (Person) o;
//        if (firstName.equals(person.firstName)
//                && lastName.equals((person.lastName))
//                && age == person.age) {
//            return true;
//        }
//        return false;
//    }

//    @Override
//    public int hashCode() {
//        return age+171;
//    }

    @Override
    public int hashCode() {
        return Objects.hash(age, firstName, lastName);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Person: ");
        stringBuilder.append(" age= ").append(age);
        stringBuilder.append(" first name: ").append(firstName);
        stringBuilder.append(" last name: ").append(lastName);
        stringBuilder.append(" gender: ").append(gender.getPlec());
        return stringBuilder.toString();
    }

    @Override
    public int compareTo(Person o) {
        return o.lastName.compareTo(lastName);
    }
}
