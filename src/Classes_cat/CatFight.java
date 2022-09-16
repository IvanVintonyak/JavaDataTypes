package Classes;

public class CatFight {
    public static void main(String... args) {

        Cat cat1 = new Cat("Ben", 5, 8) {
        };
        Cat cat2 = new Cat("Bob", 8, 9) {
        };
        Cat cat3 = new Cat("Den", 7, 10) {
        };


        boolean round1 = cat1.fight(cat2);
        System.out.println("Round 1. Result, has won " + (round1 ? cat1.getName() : cat2.getName()));
        boolean round2 = cat1.fight(cat3);
        System.out.println("Round 2. Result, has won " + (round2 ? cat1.getName() : cat3.getName()));
        boolean round3 = cat2.fight(cat3);
        System.out.println("Round 3. Result, has won " + (round3 ? cat2.getName() : cat3.getName()));

    }
}
