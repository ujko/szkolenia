package day2.stream;

import day2.dao.EmployeesDao;
import day2.lambda.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        //main.sample();
        //main.sampleStream();
        main.sampleStreamCopy();
    }

    public void sample() {
        List<Employee> employees = EmployeesDao.createlist();
        for (Employee employee : employees) {
            if (employee.getAge() >= 18 && employee.getLastName().startsWith("J")) {
                System.out.println(employee);
            }
        }
    }

    public void sampleStream() {
        List<Employee> employees = EmployeesDao.createlist();
//        Stream<Employee> employeeStream = employees.stream();
//        employeeStream.filter(e -> e.getAge() >= 18).forEach(System.out::println);
        employees.stream()
                .filter(e -> e.getAge() >= 18)
                .filter(e -> e.getLastName().startsWith("J"))
                //.map(e -> e.getLastName().toUpperCase())
                .sorted((e1, e2) -> e1.getAge() - e2.getAge())
                .forEach(System.out::println);

    }

    public void sampleStreamCopy() {
        List<Employee> employees = EmployeesDao.createlist();
//        Stream<Employee> employeeStream = employees.stream();
//        employeeStream.filter(e -> e.getAge() >= 18).forEach(System.out::println);
        List<Employee> employeesCopy = employees.stream()
                .filter(e -> e.getAge() >= 18)
                .filter(e -> e.getLastName().startsWith("J"))
                .collect(Collectors.toList());
        employeesCopy.forEach(System.out::println);
    }

}
