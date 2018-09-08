package day2.dao;

import day2.lambda.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeesDao {
    public static List<Employee> createlist() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Pawel", "Jackowski", 32));
        list.add(new Employee("Darek", "Jezio", 26));
        list.add(new Employee("Stachu", "Kwiatkowski", 12));
        list.add(new Employee("Jan", "Nowak", 56));
        list.add(new Employee("Kasia", "Jackowska", 40));
        return list;
    }

}
