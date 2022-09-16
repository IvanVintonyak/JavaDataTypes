package collections;

import java.util.HashMap;
import java.util.Map;

public class Solution8 {
    /*
    1. Create the class Cat with variable name
    2. Create HashMap<String, Cat>
    3. Add to the map 10 cats, as a key, use the name of the Cat
    4. Print to the console each element from new line
     */

    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"Tim", "Missy", "Smokey", "Marmalade", "Oscar", "Snowball", "Boss", "Smudge", "Max", "Simba"};

        HashMap<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static HashMap<String, Cat> addCatsToMap(String[] cats) {
        HashMap<String, Cat> map = new HashMap<>();
        for (String cat : cats) {
            map.put(cat, new Cat(cat));
        }
        return map;
    }
}


class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name != null ? name : null;
    }

}
