package Classes;

public class Cat {
//    1. Create class Cat
//    1.1. Create class Cat
//    1.2. Cat should have name (String), age (int), weight (int)
//    1.3. Create getters and setters for each variable
//2. Implement method fight
//    2.1. Create method - boolean fight(Cat anotherCat)
//    2.2. Implement the method with the logic of fighting the cats
//    that depends on weight, age and strength.
//    The method should calculate the result of fighting, did we win(this)
//    and if yes - return true, if no - return false
//    Should calculate next condition:
//            if cat1.fight(cat2) == true -> cat2.fight(cat1) == false
//            3. Create 3 object of Cat
//    3.1. In the method main create 3 object of type Cat, fill them with data
//4. Create 3 rounds of fight in pairs between the cats.
//            5. The result of each fight print to the console


    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {

        this.name = name;
        this.age = age;
        this.weight = weight;

    }


    public boolean fight(Cat anotherCat) {

        return false;
    }

    public String getName() {
        return name;

    }

    public void seName(String name) {
        this.name = name;

    }


    public void setAge(int age) {

        this.age = age;
    }

    public int getAge() {
        return age;

    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

    public int getWeight() {
        return weight;

    }


}

