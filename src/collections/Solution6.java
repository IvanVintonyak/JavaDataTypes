package collections;

import java.util.HashSet;

public class Solution6 {
    /*
    1. Create collection HashSet with type <String>
    2. Put 10 strings (banana, cherry, pear, melon, blackberry, ginseng, strawberry, toffee, potato)
    3. Print to the console this collection, each element from new line
    4. Pay attention to the order changed order of the strings
     */
    public static void main(String[] args) {
        HashSet<String> products = new HashSet<>();
        products.add("banana");
        products.add("cherry");
        products.add("pear");
        products.add("melon");
        products.add("blackberry");
        products.add("ginseng");
        products.add("strawberry");
        products.add("toffee");
        products.add("potato");


        for (String i : products) {
            System.out.println(i);
        }
    }
}
