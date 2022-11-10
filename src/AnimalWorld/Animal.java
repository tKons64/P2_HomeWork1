package AnimalWorld;

import javax.swing.*;
import java.util.Objects;

public abstract class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("Я ем!");
    }

    public void sleep() {

    }

    public void go() {
        System.out.println("Я бегу!");
    }

    public String СheckStringValueInClass(String checkString) {
        if (checkString == null || checkString.isEmpty() || checkString.isBlank()) {
            return "default";
        } else {
            return checkString;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    @Override
    public String toString() {
        return "Животное: " + name +
                ", возраст: " + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
