package For_loop;

import java.util.Scanner;

public class PrintRectangle {
    /*
   Read 2 numbers from console (m & n)
   using for loop
   print to console a rectangle size m * n from 8 numbers
   Example:
   m=2, n=4
   8888
   8888
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < m; j++) {
                if (i == 0 || i == n - 1 ||
                        j == 0 || j == m - 1)
                    System.out.print("8");
                else
                    System.out.print("");
            }
        }
    }

}

