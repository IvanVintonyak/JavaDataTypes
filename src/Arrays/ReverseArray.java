package Arrays;

import java.util.Scanner;

//
public class ReverseArray {
    /*
    1. Create an Array, of 10 String elements
    2. Input from the console 8 Strings and save them to the array
    3. Print to the console (10 elements) in reverse order. Each element from new line
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = new String[10];
        System.out.println("Please enter array elements");
        for (int i = 0; i < 8; i++) {
            array[i] = sc.nextLine();
        }
        for (int i = array.length; i > 0; i--) {
            sc.close();
            System.out.println(array[i - 1]);
        }
    }
}


