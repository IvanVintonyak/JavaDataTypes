package If_Else;

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

    private static void printMaxOfFour(int a, int b, int c, int d) {
        if (!(a < b || a < c || a < d)) {
            System.out.println(a + " is the biggest variable");
        } else if (!(b < c || b < d)) {
            System.out.println(b + " is the biggest variable");
        } else if (!(c < d)) {
            System.out.println(c + " is the biggest variable");
        } else {
            System.out.println(d + " is the biggest variable");
        }
    }
}
