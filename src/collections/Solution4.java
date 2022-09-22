package collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution4 {
    /*
    1. Create List of Strings
    2. Read from the console 5 strings and add them to the List, each element to the beginning of this List
    3. Using loop, print all the items to the console from the List
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 cars name");
        Deque<String> cars = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            cars.addFirst(scanner.nextLine());
        }
        for (String i : cars) {
            System.out.println(i);
            scanner.close();
        }
    }
}
