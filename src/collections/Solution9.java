package collections;

import java.util.HashMap;

public class Solution9 {
    /*
    1. Create collection of HashMap<String, String>
    2. Put 10 Strings there
    3. Print the list of Keys, each key from the new line
     */
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "2");
        hashMap.put("3", "4");
        hashMap.put("5", "6");
        hashMap.put("7", "8");
        hashMap.put("9", "10");
        hashMap.put("11", "12");
        hashMap.put("13", "14");
        hashMap.put("21", "22");
        hashMap.put("15", "16");
        hashMap.put("17", "18");
        hashMap.put("19", "20");


        for (String i : hashMap.keySet()) {
            System.out.println(i);
        }
    }
}
