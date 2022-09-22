package C_c;

import java.util.Comparator;

 public class NameComparatorD implements Comparator <Cat> {


     @Override
     public int compare(Cat cat, Cat cat1) {
         return cat1.compareTo(cat);
     }
 }
