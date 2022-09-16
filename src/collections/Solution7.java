package collections;

import java.util.HashMap;

public class Solution7 {
    /*
    1. Create collection HashMap<String, String>
    2. Put there 10 pairs:
        banana - grass,
        cherry - berry,
        pear - fruit,
        melon - vegetable,
        blackberry - berry,
        ginseng - root,
        strawberry - berry,
        toffee - flower,
        potato - tuber
     3. Print all the collection to the console, each element from the new line
     Example:
        banana - grass
     */

    public static void main(String[] args) {
        HashMap<String, String> products = new HashMap<>();
        products.put("banana", "grass");
        products.put("cherry", "berry");
        products.put("pear", "fruit");
        products.put("melon", "vegetable");
        products.put("blackberry", "berry");
        products.put("ginseng", "root");
        products.put("strawberry", "berry");
        products.put("toffee", "flower");
        products.put("potato", "tuber");


        for (String i : products.keySet()) {
            System.out.println(i + " - " + products.get(i));
        }
    }
}
