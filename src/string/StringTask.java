package string;

import java.util.Scanner;
import java.util.Arrays;

public class StringTask {
    private static String s;
    private static char c;

    public static void main(String[] args) {
        String s = "Hey how are you";
        System.out.println(s.length());
        System.out.println(s.charAt(14));
        System.out.println(s.indexOf("a"));
        System.out.println(s.substring(0, 8));
        System.out.println(s.startsWith("h"));
        System.out.println(s.startsWith("H"));
        System.out.println(s.contains("are you"));
        System.out.println(s.contains("are you "));
        System.out.println(s.replace("how", "who"));
        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));
        getCharQuantityInTheString("Hello how are you", (c));
        greeting("Ivan", 31);

        //print the length of the string
        //print the last char of the string (use the previous method to calculate the index - do not use hardcoded indexes)

        //print the index of 'a'

        //substirng the string by the second space " " - result should be "Hey how"

        //check if the string start with 'h', with 'H', end with '\'

        //check if the string contains "are you" contains "are you "

        //replace "how" to "who"

        //split the string via space " " and print each word from the new line

        //create the method that takes String and char parameters and return the quantity of letters that exist in that string

        //create the greeting method that takes name and age and print the string - "Hey, my name is Andrii, and I'm 41 years old"
        // (Use String.format function)
    }

    public static int getCharQuantityInTheString(String s, char c) {
        s.length();
        return 0;
    }


    public static void greeting(String name, int age) {
        System.out.println("Hey, my name is " + name + "," + " and I'm " + age + " years old ");
    }

}
