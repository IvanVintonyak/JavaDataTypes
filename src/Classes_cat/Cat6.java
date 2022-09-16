package Classes;

public class Cat6 {
    /*
    Create 5 constructors
    1. Name
    2. Name, weight, age
    3. Name, age. (weight should be standard)
    4. weight, color. (name, address and age are unknown. Cat is homeless)
    5. weight, color, address
    Each constructor should create the valid object.
    For example, if we don't know weight, we should specify some kind of standard weight.
    Because cat cannot weight anything
    The same with age
    But it cannot have name(null) and address(null)
     */
    public static void main(String[] args) {
        Cat6 cat1 = new Cat6();


    }

    String name;
    int weight;
    int age;
    String color;
    String address;


    public Cat6() {
        this.name = "Homeless";
        this.weight = 5;
        this.age = 7;
        this.color = "Black";
        this.address = "Homeless";
    }


    public Cat6(String name) {
        System.out.println("1 constructor");
        this.name = name;

    }

    public Cat6(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        System.out.println("2 constructor");
    }

    public Cat6(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 5;
        System.out.println("3 constructor");
    }

    public Cat6(int weight, String color) {
        this.weight = weight;
        this.color = color;
        System.out.println("4 constructor");
    }

    public Cat6(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        System.out.println("5 constructor");

    }
}
