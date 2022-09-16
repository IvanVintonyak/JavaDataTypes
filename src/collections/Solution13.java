package collections;

import java.util.HashMap;
import java.util.Map;

public class Solution13 {
    /*
    1. Create Map<String, String>
    2. Put there 10 elements (key-Surname, value-Name)
    3. Remove people who have the same names
    4. Print the result, each element from new line
     */
    public static void main(String[] args) {
        Map<String, String> people = new HashMap<>();

        people.put("Marl", "Bob");
        people.put("Marly", "Ben");
        people.put("Male", "Bred");
        people.put("Mre", "Tim");
        people.put("Aee", "Rod");
        people.put("Red", "Fed");
        people.put("Arly", "Oren");
        people.put("Marley", "Bob");
        people.put("Mam", "Bob");
        people.put("Rly", "Bob");

        Map<String, String> newPeople = new HashMap<>();
        for (Map.Entry<String, String> pair : people.entrySet()) {
            newPeople.put(pair.getValue(), pair.getKey());
        }
        {

        }
        for (String i : newPeople.keySet()) {
            System.out.println(i + " - " + newPeople.get(i));
        }

    }
}
