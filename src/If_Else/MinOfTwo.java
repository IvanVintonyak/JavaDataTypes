package If_Else;

import java.util.Scanner;

public class MinOfTwo {
    /*
  Enter and reed four numbers from the console
  Implement method which prints min of two variable
   */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        printMinOfTwo(one, two);
        scanner.close();
    }

    private static void printMinOfTwo(int a, int b) {
        if (a <= b) {
            System.out.println(a + " is the lowest variable");
        } else {
            System.out.println(b + " is the lowest variable");
        }
    }
}

