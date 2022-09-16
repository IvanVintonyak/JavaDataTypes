package collections;

import java.util.HashSet;
import java.util.Set;

public class Solution12 {
    /*
    1. Create Set<Integer>
    2. Add there 20 different numbers
    3. Remove from the set all the numbers bigger than 10
     */

    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(22);
        numbers.add(45);
        numbers.add(84);
        numbers.add(9);
        numbers.add(86);
        numbers.add(445);
        numbers.add(75);
        numbers.add(85);
        numbers.add(83);
        numbers.add(88);
        numbers.add(855);
        numbers.add(132);
        numbers.add(112);
        numbers.add(118);

        numbers.removeIf(i -> i > 10);
        System.out.println(numbers);

    }
}

