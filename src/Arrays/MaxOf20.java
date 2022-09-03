package Arrays;

import java.util.Scanner;

public class MaxOf20 {
    /*
    1. In the method initializeArray():
    1.1. Create an Array - size 20
    1.2. Read numbers from the console and fill in this array
    2. Method max(int[] array) should find max number from elements of an array
     */
    public static void main(String[] args) {
        int[] array = initializeArray();
        int maxNumber = max(array);
        System.out.println("The max array is " + maxNumber);
    }

    private static int[] initializeArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of array");
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
            array[i] = scanner.nextInt();

        return array;
    }

    private static int max(int[] array) {
        int i;
        int max = array[0];
        for (i = 1; i < array.length; i++)
            if (array[i] > max)
                max = array[i];

        return max;
    }
}

