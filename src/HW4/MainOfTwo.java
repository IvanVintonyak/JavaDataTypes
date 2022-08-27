package HW4;

import java.util.Scanner;

public class MainOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        printMinOfTwo(one, two);
        scanner.close();
    }

    private static void printMinOfTwo(int one, int two) {
        if (one <= two) {
            System.out.println(one + " is the lowest variable");
        } else {
            System.out.println(two + " is the lowest variable");
        }
    }
}

