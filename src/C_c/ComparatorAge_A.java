package C_c;

import java.util.Comparator;

public class ComparatorAge_A implements Comparator<Cat> {


    @Override
    public int compare(Cat cat, Cat cat1) {
        return cat.getAge() -cat1.getAge();
    }
}