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
            System.out.println(a);

        } else if (b > c && b > a) {
            System.out.println(b);
        }

        else if (c < b) {

            System.out.println(c);
        }
    }
}