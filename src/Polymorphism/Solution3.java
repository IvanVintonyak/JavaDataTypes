package Polymorphism;

    /* Cat from the Cat, Dog from the Dog
    Override method getChild in the classes Cat and Dog,
    that cat creates cat, and dog creates dog.
    */

public class Solution3 {
    public static void main(String[] args) {
        Pet pet1 = new Pet();
        Pet cat = pet1.getChild();

        Pet pet2 = new Dog();
        Pet dog = pet2.getChild();
    }

    public static class Pet {
        public Pet getChild() {
            return new Pet();
        }
    }

    public static class Cat extends Pet {
        public Cat getChild() {
            return null;
        }

    }

    public static class Dog extends Pet {
        public Dog getChild() {
            return null;


        }
    }
}

