package collection.set.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10, 5, 1};

        Set<Integer> linkedSet = new LinkedHashSet<>(List.of(inputArr));

        /*
        for (int i = 0; i < inputArr.length; i++) {
            linkedSet.add(inputArr[i]);
        }
        */

        for (Integer l : linkedSet) {
            System.out.println(l);
        }
    }
}
