package day4.homework;

import java.io.Serializable;

public class Car implements Serializable {
    private String name;
    private String colour;
    private int age;

    public Car(String name, String colour, int age) {
        this.name = name;
        this.colour = colour;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                '}';
    }
}
