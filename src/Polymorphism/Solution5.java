package Polymorphism;
    /* "Cow" or "Whale" or "Dog" or "Unknown animal"
    Implement method, that defines, the type of object which class was passed,
    And return the result – one of the strings: "Cow", "Whale", "Dog", "Unknown animal".
    */

public class Solution5 {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        int c = 4;
        String value =" ";
        switch (c) {
            case 1:
                if (o instanceof Cow)
                    value = "Cow";
                break;
            case 2:
                if (o instanceof Whale)
                    value = "Whale";
                 break;
            case 3:
                if (o instanceof Dog)
                    value = "Dog";
                 break;
            case 4:
                if (o instanceof Pig)
                    value = "Unknown animal";
                 break;
        }
        return value;
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
