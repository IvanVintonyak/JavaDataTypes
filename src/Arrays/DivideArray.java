package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DivideArray {
    /*
    1. Create an int Array, size 20
    2. Read numbers from the console and fill in this Array
    3. Create 2 int Arrays, size 10 each
    4. Copy big array into 2 small. First half to the first Array, Second half to the second Array
    5. Print second small array to the console
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] bigArray = new int[20];
        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = sc.nextInt();
        }

        int[] firstSmallArray = new int[10];
        int[] secondSmallArray = new int[10];
        firstSmallArray = Arrays.copyOfRange(bigArray, 0, bigArray.length / 2);
        secondSmallArray = Arrays.copyOfRange(bigArray, bigArray.length / 2, bigArray.length);
        sc.close();
        System.out.println("The first small array:: " + Arrays.toString(firstSmallArray));
        System.out.println("The second small array:: " + Arrays.toString(secondSmallArray));
    }
}
