package collection.set.test;

import java.util.*;

public class SetOperationsTest {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        union(set1, set2);
        intersection(set1, set2);
        difference(set1, set2);
    }

    //합집합
    private static void union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set = new HashSet<>();

        for (Integer s : set1) {
            set.add(s);
        }

        for (Integer s : set2) {
            set.add(s);
        }

        System.out.println("합집합: " + set);
    }

    private static void intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set = new LinkedHashSet<>();

        for (Integer i : set2) {
            boolean result = set1.contains(i);

            if (result) {
                set.add(i);
            }
        }

        System.out.println("교집합: " + set);
    }

    private static void difference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set = new HashSet<>(set1);
        set.removeAll(set2);
        System.out.println("차집합: " + set);
    }
}
