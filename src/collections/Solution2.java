package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution2 {
    /*
    1. Create List of Strings
    2. Read from the console 5 strings and add them to the List (Scanner class)
    3. Using loop find the longest string in the List
    4. Print to the console found string
    5. If there are several longest strings, print each of them.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 cars name");
        ArrayList<String> cars = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            cars.add(scanner.nextLine());
        }

        String longestStr = null;
        for (String name : cars) {
            if (null == longestStr || name.length() > longestStr.length()) {
                longestStr = name;
            }
        }
        System.out.println("\nLongest String is = " + longestStr);
        scanner.close();
    }
}






