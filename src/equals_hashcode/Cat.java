package equals_hashcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class Cat {
    /*
    Override methods equals() and hashCode() that it took @name and @age
    Create several object with the same names and ages and different and print the result of comparing
    Override toString method - when we call System.out.println(cat) -> it should print: "Cat name: Tom, age: 5, weight: 3"
     */

    private String name;
    private int age;
    private int weight;


    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && name.equals(cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Cat name: " + name + "," + " age: " + age + " weight: " + weight;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Tom", 3, 6);
        Cat cat1 = new Cat("Tom", 3, 6);
        Cat cat2 = new Cat("Tim", 8, 9);
        System.out.println(cat);
        System.out.println(cat.equals(cat));
        System.out.println(cat.hashCode());
    }
}


