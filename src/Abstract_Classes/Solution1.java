package Abstract_Classes;

public class Solution1 {
     /*
    Extend class Cow from animal
    implement all the necessary methods
     */

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal {
        @Override
        public String getName() {
            return null;
        }
    }
}

