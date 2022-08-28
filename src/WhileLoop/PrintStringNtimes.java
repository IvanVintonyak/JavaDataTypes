package WhileLoop;

import java.util.Scanner;

public class PrintStringNtimes {
    /*
   Enter from the console a string and a number
   Print string n times
   using loop while
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print name");
        String s = scanner.nextLine();
        System.out.println("Enter number");
        int n = scanner.nextInt();
        scanner.close();
        int i = 0;
        do {
            System.out.println("Hi "+ s);
            i++;
        }
        while (i < n);

    }
}
