package HW4;

import java.util.Scanner;

public class SortOfThree {
    /*
   Enter and reed three numbers from the console
   Implement method which prints them from highest to lowest
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        printFromHighestToLowest(one, two, three);
        scanner.close();
    }

    private static void printFromHighestToLowest(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.printf("%d,%d,%d", a, b, c);
        } else if (b > c) {
            System.out.printf("%d,%d,%d", b, c, a);
        } else {
            System.out.printf("%d,%d,%d", c, b, a);
        }
    }
}