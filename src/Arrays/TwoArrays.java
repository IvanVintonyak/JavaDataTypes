package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class TwoArrays {
    /*
  1. Create an Array of Strings, size 10
  2. Create an Array of int, size 10
  3. Read from the console and fill in the Array with Strings
  4. Fill in the int Array with length of Strings from the first Array.
      If the first element contains "Hello", we put in the first element of int Array - 5
  5. Print the int Array to the console
   */
    public static void main(String[] args) {
        String[] stringArray = new String[10];
        int[] intArray = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array elements");
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = scanner.nextLine();
            intArray[i] = stringArray[i].length();
        }
        scanner.close();
        System.out.println(Arrays.toString(intArray));
    }
}

