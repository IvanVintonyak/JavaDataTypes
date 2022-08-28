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
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 1 || i == n ||
                        j == 1 || j == m)
                    System.out.print(m);
                else
                    System.out.print(n);
            }
            System.out.println();
        }

    }

}

