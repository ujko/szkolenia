package day2.lambda;

import day2.dao.EmployeesDao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
//        new Main().sample();
//        System.out.println("**********************");
//        new Main().sampleLambda();
//        new Main().printList();
        //new Main().printEmployees();
        Main main = new Main();
        //main.sortEmployees(main.createlist());
        main.sortEmployeesByAge(EmployeesDao.createlist());
    }


    private void sample() {
        Func add = new Func() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        };
        Func odd = new Func() {
            @Override
            public int calc(int a, int b) {
                return a - b;
            }
        };
        int c1 = 7;
        int c2 = 3;
        System.out.println(add.calc(c1, c2));
        System.out.println(odd.calc(c1, c2));
    }

    private void sampleLambda() {
        Function<Integer, String> ch = (a) -> "Liczba: " + a;
        Func add = (a, b) -> a + b;
        Func odd = (a, b) -> a - b;
        int c1 = 7;
        int c2 = 3;
        System.out.println(add.calc(c1, c2));
        System.out.println(odd.calc(c1, c2));
        System.out.println(ch.apply(3));
    }

    private void printList() {
        List<String> list = new ArrayList<>();
        list.add("Pawel");
        list.add("Kasia");
        list.add("Józek");
        list.forEach(a -> System.out.println(a));
        System.out.println("***********************");
        list.forEach(System.out::println);
    }

    private void printEmployees() {
        List<Employee> list = EmployeesDao.createlist();
        list.forEach(a -> System.out.println(a.getAge() + ":" + a.getFirstName()));
        list.forEach(System.out::println);
    }

//    private List<Employee> createlist() {
//        List<Employee> list = new ArrayList<>();
//        list.add(new Employee("Pawel", "Jackowski", 32));
//        list.add(new Employee("Darek", "Jezio", 26));
//        list.add(new Employee("Stachu", "Kwiatkowski", 12));
//        list.add(new Employee("Jan", "Nowak", 56));
//        list.add(new Employee("Kasia", "Jackowska", 40));
//        return list;
//    }

//    private void sortEmployees(List<Employee> list){
//        Collections.sort(list);
//        list.forEach(System.out::println);
//        System.out.println("*************");
//        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getFirstName().compareTo(o2.getFirstName());
//            }
//        };
//        Collections.sort(list, employeeComparator);
//        list.forEach(System.out::println);
//    }

//    private void sortEmployees(List<Employee> list) {
//        Collections.sort(list);
//        list.forEach(System.out::println);
//        System.out.println("*************");
//        Comparator<Employee> employeeComparator = (o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName());
//        Collections.sort(list, employeeComparator);
//        list.forEach(System.out::println);
//    }

    private void sortEmployees(List<Employee> list) {
        Collections.sort(list);
        list.forEach(System.out::println);
        System.out.println("*************");
        Collections.sort(list, (o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName()));
        list.forEach(System.out::println);
    }

    private void sortEmployeesByAge(List<Employee> list) {
        Collections.sort(list, (a1, a2) -> a1.getAge() - a2.getAge());
        list.forEach(System.out::println);
    }

}
