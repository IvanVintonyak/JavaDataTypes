package HW4;

import java.util.Scanner;

public class MaxOfFour {
    /*
    Enter and reed four numbers from the console
    Implement method which prints max of four variable
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter four numbers:");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        int four = scanner.nextInt();
        printMaxOfFour(one, two, three, four);
        scanner.close();
    }

    private static void printMaxOfFour(int one, int two, int three, int four) {
        if (!(one < two || one < three || one < four)) {
            System.out.println(one + " is the biggest variable");
        } else if (!(two < three || two < four)) {
            System.out.println(two + " is the biggest variable");
        } else if (!(three < four)) {
            System.out.println(three + " is the biggest variable");
        } else {
            System.out.println(four + " is the biggest variable");
        }
    }
}
