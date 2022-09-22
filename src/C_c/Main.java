package C_c;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String args[]) {
        List<Cat> cats = new ArrayList<>();
        Cat cat = new Cat("Bob", 26);
        Cat cat1 = new Cat("Ben", 24);


        cats.add(cat);
        cats.add(cat1);
        Collections.sort(cats, new NameComparatorD());
        for (Cat cat2 : cats) {
            System.out.println(cat2);
        }

    }
}
