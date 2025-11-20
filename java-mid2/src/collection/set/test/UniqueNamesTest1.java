package collection.set.test;

import java.util.*;

public class UniqueNamesTest1 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < inputArr.length; i++) {
            set.add(inputArr[i]);
        }

        /*
        List<Integer> list = new ArrayList<>(set);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        */

        //두 코드는 같다.

        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
