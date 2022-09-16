package collections;

import java.util.HashMap;

public class Solution11 {
    /*
    1. Create collection of HashMap<String, Object>
    2. Put 10 Strings there
    3. Print the map, each pair from new line
    Example:
        Sim - 5
     */

    public static void main(String[] args) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("Sim", "2");
        hashMap.put("Bob", "4");
        hashMap.put("Ted", "6");
        hashMap.put("Ben", "8");
        hashMap.put("Tom", "10");
        hashMap.put("Ren", "12");
        hashMap.put("Nil", "14");
        hashMap.put("Tep", "22");
        hashMap.put("Bon", "16");
        hashMap.put("Tin", "18");
        hashMap.put("Bin", "20");


        for (String i : hashMap.keySet()) {
            System.out.println(i + " - " + hashMap.get(i));
        }
    }
}
