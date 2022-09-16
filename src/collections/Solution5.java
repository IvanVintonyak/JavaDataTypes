package collections;

import java.util.LinkedList;
import java.util.Scanner;

public class Solution5 {
    /*
    1. Create List of Strings
    2. Read from the console 5 strings and add them to the List (Scanner class)
    3. Remove the last element and put it to the beginning of the List, Repeat 13 times
    4. Using loop, print all the items to the console from the List
    */

    public static void main(String[] args) {

        LinkedList<String> cars = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 cars name");
        for (int i = 0; i < 5; i++) {
            cars.add(scanner.nextLine());
        }

        for (int i = 0; i < 13; i++) {
            cars.addFirst(cars.getLast());
            cars.removeLast();
        }
        for (String i : cars) {
            System.out.println(i);

        }
        scanner.close();

    }
}

