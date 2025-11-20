package collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesTest3 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        Set<Integer> treeSet = new TreeSet<>(List.of(inputArr));
        /*
        for (int i = 0; i < inputArr.length; i++) {
            treeSet.add(inputArr[i]);
        }
        */

        for (Integer t : treeSet) {
            System.out.println(t);
        }
    }
}
