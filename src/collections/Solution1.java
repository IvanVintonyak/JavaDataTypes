package collections;

import java.util.ArrayList;

public class Solution1 {
    /*
    1. Create List of Strings
    2. Add 5 different strings
    3. Print to the console the size of the List
    4. Using loop, print all the items to the console from the List
     */
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Audi");
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
